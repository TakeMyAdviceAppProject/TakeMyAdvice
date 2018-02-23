package com.example.lightdance.takemyadvice.model.usercenter.user;

import android.support.annotation.NonNull;

import com.example.lightdance.takemyadvice.model.base.LoggedUser;
import com.example.lightdance.takemyadvice.model.usercenter.user.bean.UserBean;
import com.example.lightdance.takemyadvice.util.HttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 有关用户信息的接口实现类
 *
 * @author LightDance
 * @date 2018/2/2.
 */
//TODO: 在考虑是否用加个context参数以便用sharedPreferences存已登录用户信息
public class UserLogic implements UserInterface {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String address = "http://10.0.2.2/get_data.json";

    private static final String OPERATE_TYPE = "operateType";
    private static final String OPERATE_LOGIN = "login";
    private static final String OPERATE_SIGNUP = "signup";
    private static final String OPERATE_SET_USER_INFO = "setUserInfo";
    private static final String OPERATE_SELECT_USER_INFO = "selectUserInfo";

    @Override
    public void login(final UserBean user, final LoginListener listener) {
        String userId = user.getUserId();
        String userPwd = user.getUserPwd();

        if (userId == null || userPwd == null || userId.length() == 0 || userPwd.length() == 0) {
            //账号密码存在空值，直接失败
            listener.onFailure();
        } else {
            //账号密码均不为空，查询是否匹配
            JSONObject jsonLoggingUser = new JSONObject();
            try {
                jsonLoggingUser.put(OPERATE_TYPE, OPERATE_LOGIN);
                jsonLoggingUser.put("userId", userId);
                String content = String.valueOf(jsonLoggingUser);
                RequestBody body = RequestBody.create(JSON, content);
                HttpUtil.sendOkHttpRequest(address, body, new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        listener.onFailure();
                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        try {
                            String responseData = response.body().string();
                            JSONArray jsonArray = new JSONArray(responseData);
                            if (jsonArray.length() == 1) {
                                //有该用户名，看密码是否一致
                                JSONObject jsonObject = jsonArray.getJSONObject(0);
                                String userLevel, userId, userNickName, userIconId;
                                String matchPwd = jsonObject.getString("userPwd");
                                if (user.getUserPwd().equals(matchPwd)) {
                                    userLevel = jsonObject.getString("userLevel");
                                    userNickName = jsonObject.getString("nickName");
                                    userId = jsonObject.getString("userId");
                                    userIconId = jsonObject.getString("userIconId");
                                    UserBean user = new UserBean(userLevel, userNickName, userId, userIconId);
                                    //设置当前登录用户信息
                                    LoggedUser.loggedUserBean = user;
                                    LoggedUser.isLogged = true;
                                    listener.onSuccess(user);
                                }
                            }else {
                                listener.onFailure();
                            }
                        } catch (JSONException e) {
                            listener.onFailure();
                            e.printStackTrace();
                        }
                    }
                });

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void signUp(final UserBean user, final SignUpListener listener) {
        String userId = user.getUserId();
        String userPwd = user.getUserPwd();

        if (userId == null || userPwd == null || userId.length() == 0 || userPwd.length() == 0) {
            //账号密码存在空值，直接失败
            listener.onFailure("获取注册账号或密码失败");
        } else {
            //账号密码均不为空，查询用户id是否已存在
            String userLevel = user.getUserLevel();
            String nickName = user.getNickName();
            String userIconId = user.getUserIconId();
            JSONObject jsonLoggingUser = new JSONObject();
            try {
                jsonLoggingUser.put(OPERATE_TYPE, OPERATE_SIGNUP);
                jsonLoggingUser.put("userLevel", user.getUserLevel());
                jsonLoggingUser.put("nickName", user.getNickName());
                jsonLoggingUser.put("userId", userId);
                jsonLoggingUser.put("userIconId", userIconId);
                jsonLoggingUser.put("userPwd", userPwd);
                UserBean newUser = new UserBean(userLevel,  nickName,  userId,  userIconId,  userPwd);
                String content = String.valueOf(jsonLoggingUser);
                RequestBody body = RequestBody.create(JSON, content);
                HttpUtil.sendOkHttpRequest(address, body, new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        listener.onFailure("服务器响应失败");
                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        try {
                            String responseData = response.body().string();
                            JSONArray jsonArray = new JSONArray(responseData);
                            if (jsonArray.length() == 1) {
                                //已有该用户名，注册失败
                                listener.onFailure("用户名已存在");
                            }else {
                                listener.onSuccess();
                            }
                        } catch (JSONException e) {
                            listener.onFailure("获取服务器数据失败");
                            e.printStackTrace();
                        }
                    }
                });

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void updateXX(UserBean user, SetUserInfoListener listener) {
//类似signup，等需求更明确些的时候再复制粘贴加具体代码吧
    }

    @Override
    public void getUserInfo(UserBean user, GetUserInfoListener listener) {
//类似login，等需求更明确些的时候再复制粘贴加具体代码吧
    }

    @Override
    public void getLogedUserInfo(GetUserInfoListener listener) {
        if (LoggedUser.isLogged){
            listener.onSuccess(LoggedUser.loggedUserBean);
        }else {
            listener.onFailure();
        }
    }
}
