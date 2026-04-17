package com.app.lango

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {

    private lateinit var webView: WebView

    inner class AppBridge {
        @JavascriptInterface
        fun getSecretKey(): String {
            return BuildConfig.MY_API_KEY
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ Debug WebView (Chrome DevTools)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true)
        }

        webView = WebView(this)
        setContentView(webView)

        val settings = webView.settings
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true
        settings.allowFileAccess = true

        webView.addJavascriptInterface(AppBridge(), "AndroidBridge")

        webView.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                if (url.startsWith("file://") || url.startsWith("http")) {
                    view.loadUrl(url)
                    return true
                }
                return false
            }
        }

        webView.loadUrl("file:///android_asset/index.html")
        window.statusBarColor = Color.parseColor("#c53bf7")
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}