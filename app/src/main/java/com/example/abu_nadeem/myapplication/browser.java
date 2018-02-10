package com.example.abu_nadeem.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        WebView webview = new WebView(this);
        setContentView(webview);
        webview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

            }
        });

        webview.loadUrl("https://ar.wikipedia.org/wiki/%D8%B3%D9%88%D8%B1%D9%8A%D8%A7");
        webview.getSettings().setJavaScriptEnabled(true);

    }


}
