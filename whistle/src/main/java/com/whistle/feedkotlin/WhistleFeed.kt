package  com.example.whistlefeed

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.webkit.WebView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.valueleaf.android_kotlin.WebViewClientImpl
import com.whistle.feedkotlin.R
import org.json.JSONException
import org.json.JSONObject

class WhistleFeed @JvmOverloads constructor(
    context:Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0

) :
   ConstraintLayout(context,attrs,defStyleAttr) {
       private var webView: WebView?=null
    var mRequestQueue: RequestQueue? = null
    var mStringRequest: StringRequest? = null
    var BASE_URL = ""
    var STAGING_URL = "http://13.232.216.75/whistle-pixel/feedAds.php?"
    var LIVE_URL = "https://pixel.whistle.mobi/feedAds.php?"
    var islivelink = true
    var scripttags = ""

    init {
        LayoutInflater.from(getContext()).inflate(R.layout.adds_view, this, true)
        webView = findViewById(R.id.whistleadds)

    }
    fun setadds(publishertoken : String,pencilsize : String)
    {
       var  packageName = context.packageName
        System.out.println("Package Name = " + packageName);
        if(islivelink)
        {
            BASE_URL=LIVE_URL
        }
        else
        {
            BASE_URL=STAGING_URL
        }

        mRequestQueue = Volley.newRequestQueue(context)

        // String Request initialized

        // String Request initialized
        mStringRequest = StringRequest(
            Request.Method.GET,
            BASE_URL + "packagename=" + packageName + "&size=" + pencilsize + "&apiToken=" + publishertoken,
            { response ->
                Log.i("", "RESPONSE :$response")
                try {
                    val jObject = JSONObject(response)
                    Log.d("jsonresponse", jObject.getString("status"))
                    if(jObject.getString("status")=="Success")
                    {
                        scripttags = jObject.getString("data")
                        Log.d("scripttags", scripttags)

                        val webSettings = webView!!.settings
                        webSettings.javaScriptEnabled = true
                        val webViewClient = WebViewClientImpl(context)
                        webView!!.webViewClient = webViewClient
                        webView!!.loadData(
                            """$scripttags""", "text/html", "UTF-8"
                        )
                        System.out.println("Package scripttags = " + scripttags);

                    }



                } catch (e: JSONException) {
                    e.printStackTrace()
                }
              //  Toast.makeText(context, "Response :$response", Toast.LENGTH_LONG).show() //display the response on screen
            }
        ) { error -> Log.i("", "Error :$error") }

        mRequestQueue!!.add<String>(mStringRequest)


    }
   }

