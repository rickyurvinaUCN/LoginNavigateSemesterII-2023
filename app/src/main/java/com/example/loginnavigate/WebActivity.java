package com.example.loginnavigate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        web_view= findViewById(R.id.web_view1);
        String url= getIntent().getStringExtra("url");
        web_view.setWebViewClient(new WebViewClient());
        web_view.loadUrl("https://"+url);
    }

    public void navigate(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}