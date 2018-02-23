package com.example.lightdance.takemyadvice.page

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lightdance.takemyadvice.R
import com.example.lightdance.takemyadvice.page.chatwithme.activity.ChatWithMeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, ChatWithMeActivity::class.java))
        finish()

        setContentView(R.layout.activity_main)
    }

}
