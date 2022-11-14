package com.zhuiyun.cool

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gyf.immersionbar.ImmersionBar

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        ImmersionBar.with(this).statusBarDarkFont(true).fullScreen(true).init();
        val texts = intent.getStringExtra("content")
        Log.e("yyyyyy","$texts")
        findViewById<TextView>(R.id.tv).text = texts
    }

    override fun onStart() {
        super.onStart()
        val texts = intent.getStringExtra("content")
        Log.e("yyyyyy","$texts")

    }
}