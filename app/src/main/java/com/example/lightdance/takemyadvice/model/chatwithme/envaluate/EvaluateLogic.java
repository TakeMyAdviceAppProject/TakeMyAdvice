package com.example.lightdance.takemyadvice.model.chatwithme.envaluate;

import android.support.annotation.NonNull;

import com.example.lightdance.takemyadvice.model.chatwithme.envaluate.bean.EvaluationBean;
import com.example.lightdance.takemyadvice.util.HttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 评价功能实现类
 *
 * @author LightDance
 * @date 2018/2/4.
 */

public class EvaluateLogic implements EvaluateInterface {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String address = "http://10.0.2.2/get_data.json";

    /**
     * 操作类型
     */
    private static final String OPERATE_TYPE = "operateType";
    private static final String OPERATE_PUBLISH = "publish";
    private static final String OPERATE_GET = "get";
    private static final String OPERATE_DELETE = "publish";

    @Override
    public void publishEvaluation(EvaluationBean evaluation, final EvaluateListener listener) {
        JSONObject jsonEvaluation = new JSONObject();
        try {
            //生成json格式数据然后存入RequestBody，调用sendOkHttpRequest()传json数据
            jsonEvaluation.put(OPERATE_TYPE, OPERATE_PUBLISH);
            jsonEvaluation.put("isReply", false);
            jsonEvaluation.put("content", evaluation.getContent());
            jsonEvaluation.put("evaluationId", evaluation.getEvaluationId());
            jsonEvaluation.put("publisherId", evaluation.getPublisherId());
            String content = String.valueOf(jsonEvaluation);
            RequestBody body = RequestBody.create(JSON, content);
            HttpUtil.sendOkHttpRequest(address, body, new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                    listener.onFailure();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    listener.onSuccess(null);
                }
            });

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getEvaluations(final EvaluateListener listener) {
        //从服务器端获取json数据然后解析
        JSONObject jsonEvaluation = new JSONObject();
        try {
            jsonEvaluation.put(OPERATE_TYPE, OPERATE_GET);
            String content = String.valueOf(jsonEvaluation);
            RequestBody body = RequestBody.create(JSON, content);
            HttpUtil.sendOkHttpRequest(address, body, new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                    listener.onFailure();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    List<EvaluationBean> evaluationBeanList;
                    String responseData = response.body().string();
                    evaluationBeanList = parseJSONWithJSONObject(responseData);
                    if (evaluationBeanList == null) {
                        listener.onFailure();
                    } else {
                        listener.onSuccess(evaluationBeanList);
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delMyEvaluation(int evaluationId, final EvaluateListener listener) {
        JSONObject jsonEvaluation = new JSONObject();
        try {
            //生成json格式数据然后存入RequestBody，调用sendOkHttpRequest()传json数据
            jsonEvaluation.put(OPERATE_TYPE, OPERATE_DELETE);
            jsonEvaluation.put("evaluationId", evaluationId);
            String content = String.valueOf(jsonEvaluation);
            RequestBody body = RequestBody.create(JSON, content);
            HttpUtil.sendOkHttpRequest(address, body, new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                    listener.onFailure();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    listener.onSuccess(null);
                }
            });

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void replyEvaluation(EvaluationBean evaluationBean, final EvaluateListener listener) {
        JSONObject jsonEvaluation = new JSONObject();
        try {
            //生成json格式数据然后存入RequestBody，调用sendOkHttpRequest()传json数据
            jsonEvaluation.put(OPERATE_TYPE, OPERATE_PUBLISH);
            jsonEvaluation.put("isReply", true);
            jsonEvaluation.put("content", evaluationBean.getContent());
            jsonEvaluation.put("evaluationId", evaluationBean.getEvaluationId());
            jsonEvaluation.put("publisherId", evaluationBean.getPublisherId());
            String content = String.valueOf(jsonEvaluation);
            RequestBody body = RequestBody.create(JSON, content);
            HttpUtil.sendOkHttpRequest(address, body, new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                    listener.onFailure();
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    listener.onSuccess(null);
                }
            });

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    private List<EvaluationBean> parseJSONWithJSONObject(String jsonData) {
        List<EvaluationBean> evaluationBeanList = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(jsonData);
            JSONObject jsonObject;
            EvaluationBean bean;
            for (int i = 0; i < jsonArray.length(); i++) {
                jsonObject = jsonArray.getJSONObject(i);
                bean = new EvaluationBean(jsonObject.getBoolean("isReply")
                        , jsonObject.getInt("evaluationId"), jsonObject.getString("publisherId")
                        , jsonObject.getString("content"));
                evaluationBeanList.add(bean);
            }
            if (evaluationBeanList.size() != 0) {
                return evaluationBeanList;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
