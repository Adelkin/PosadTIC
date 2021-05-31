package com.example.posadtic;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Weather extends AppCompatActivity{
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity);

        WebView webView = findViewById(R.id.webview_id1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://weather.com/ru-RU/weather/tenday/l/Sergiyev+Posad+Moscow+Oblast?canonicalCityId=6fe646b55e534c3b0e3478c062360e4eac4baba0e80006d077fb30a48e1630fc");

        WebViewClient webViewClient = new WebViewClient() {
            @SuppressWarnings("deprecation") @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            @TargetApi(Build.VERSION_CODES.N) @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true;
            }

        };
        webView.setWebViewClient(webViewClient);

        //git config --global user.email "adel99685@gmail.com"
        //git config --global user.name "Adelkin"
    }
}
