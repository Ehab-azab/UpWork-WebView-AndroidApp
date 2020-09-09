package com.example.simple_webview_upwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class the_Web_View extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView=findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.upwork.com");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        if(Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
         //   Log.d(AppConstants.Tag,"SDk version above android L so forcibaly enabling ThirdPartyCookies");
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView,true);
        }
    }
}