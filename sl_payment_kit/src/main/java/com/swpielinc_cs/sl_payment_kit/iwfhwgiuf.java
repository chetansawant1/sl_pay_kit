package com.swpielinc_cs.sl_payment_kit;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class iwfhwgiuf extends AppCompatActivity {
    private String mid,reqType,data;
    private WebView webView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_web);
        Intent intent = getIntent();
        mid = intent.getStringExtra("mid");
        data = intent.getStringExtra("data");
        reqType = intent.getStringExtra("reqType");
        this.webView = (WebView) findViewById(R.id.cs_webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webView.setWebViewClient(new Callback());
        webSettings.setJavaScriptEnabled(true);
        postData();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && this.webView.canGoBack()) {
            this.webView.goBack();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {

    }

    private class Callback extends WebViewClient {  //HERE IS THE MAIN CHANGE.

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return (false);
        }

    }

    private void postData() {
        if (reqType.equals("slTrnReq")){

            webView.loadUrl("https://innovativetycoon.com/hdyvduydybdiusgfewibfgefuiweg.php?mid="+mid+"&data="+data);
        }else if(reqType.equals("slMotoTrnReq")){

            webView.loadUrl("https://innovativetycoon.com/uydvcfiuygfiwbbfrgfireufuibrfuimoto.php?mid="+mid+"&data="+data);
        }
    }
}
