package com.ensontech.alcprofile;

import android.content.Intent;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class AboutAlc extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        WebView webView=findViewById(R.id.web_view);
        
        webView.loadUrl("https://www.andela.com/alc");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        ImageView backStack=findViewById(R.id.back_stack);
        backStack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        
        
    }
}
