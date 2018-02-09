package com.example.lightdance.takemyadvice.page.chatwithme.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lightdance.takemyadvice.R;
import com.example.lightdance.takemyadvice.page.chatwithme.contract.ChatWithMeContract;

public class ChatWithMeFragment extends Fragment implements ChatWithMeContract.View {
    private ChatWithMeContract.Presenter presenter;//延迟加载比较麻烦，省了

    @Override
    public void bindPresenter(ChatWithMeContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat_with_me , container , false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);

            // 在 onActivityCreated 生命周期中调用 presenter 的 start
            presenter.start();
            Button btnTyping = getView().findViewById(R.id.btn_typing);
        btnTyping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO 加入activity的跳转逻辑，暂未完成
            }
        });
    }

    @Override
    public void showMessage(String msg, int level) {

    }

    @Override
    public void showUserMsg(String iconId, String userName) {

    }

    @Override
    public void onLoading() {

    }
}
