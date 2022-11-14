package com.zhuiyun.cool

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.gyf.immersionbar.ImmersionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImmersionBar.with(this).statusBarDarkFont(true).fullScreen(true).init();
        findViewById<Button>(R.id.btn).setOnClickListener {
            val intent = Intent(this, ContentActivity::class.java)
            val str=findViewById<EditText>(R.id.edittext).text
            Log.e("yyyyy","$str")

            intent.putExtra("content", str.toString())
//            val bundle=Bundle()
//            bundle.putString("content",str)
            startActivity(intent)
        }
    }
}