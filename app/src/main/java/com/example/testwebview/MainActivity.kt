package com.example.testwebview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// 内部的网页显示
        val webView: WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true // ★Javascriptの有効化★
        webView.loadUrl("https://swallow-incubate.com/")
// 内部的网页显示


//// 用外部的浏览器显示
//        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://swallow-incubate.com/"))
//        startActivity(intent)
//// 用外部的浏览器显示
    }
}