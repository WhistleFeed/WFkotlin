package com.valueleaf.android_kotlin

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewClientImpl(activity: Context?) : WebViewClient() {
    private var activity: Context? = null
    override fun shouldOverrideUrlLoading(webView: WebView, url: String): Boolean {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        activity!!.startActivity(intent)
        return true
    }
    init {
        this.activity = activity
    }
}