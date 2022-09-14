package  com.example.whistle

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.webkit.WebView
import androidx.constraintlayout.widget.ConstraintLayout
import com.valueleaf.android_kotlin.WebViewClientImpl

class Whistletest @JvmOverloads constructor(
    context:Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0

) :
   ConstraintLayout(context,attrs,defStyleAttr) {
       private var webView: WebView?=null
    init {
        LayoutInflater.from(getContext()).inflate(R.layout.adds_view, this, true)
        webView = findViewById(R.id.whistleadds)

    }

    fun setadds(publishertoken : String,pencilsize : String)
    {
        val packageName = context.packageName
        System.out.println("Package Name = " + packageName);

        var Scripttags= """<!DOCTYPE html>
        <html lang="en">
       <body>
<script src="https://pixel.whistle.mobi/feedAds.js" size="$pencilsize" token="$publishertoken" packagename="$packageName"></script>  
     </body>
     </html>""";

        val webSettings = webView!!.settings
        webSettings.javaScriptEnabled = true
        val webViewClient = WebViewClientImpl(context)
        webView!!.webViewClient = webViewClient
        webView!!.loadData(
            Scripttags, "text/html", "UTF-8"
        )

    }
   }

