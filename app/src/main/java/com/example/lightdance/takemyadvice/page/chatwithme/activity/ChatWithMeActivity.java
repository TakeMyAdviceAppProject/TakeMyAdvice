package com.example.lightdance.takemyadvice.page.chatwithme.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.lightdance.takemyadvice.R;
import com.example.lightdance.takemyadvice.page.chatwithme.contract.ChatWithMeContract;
import com.example.lightdance.takemyadvice.page.chatwithme.fragment.ChatWithMeFragment;
import com.example.lightdance.takemyadvice.page.chatwithme.presenter.ChatWithMePresenter;

public class ChatWithMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_with_me);

        ChatWithMeFragment fragment = new ChatWithMeFragment();
        ChatWithMePresenter presenter = new ChatWithMePresenter();
        fragment.bindPresenter(presenter);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
    }
}
