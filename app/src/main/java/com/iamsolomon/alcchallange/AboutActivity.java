package com.iamsolomon.alcchallange;


import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        /*Add in Oncreate() funtion after setContentView()*/
// initiate a web view
        WebView simpleWebView=(WebView) findViewById(R.id.simpleWebView);
// specify the url of the web page in loadUrl function
        simpleWebView.loadUrl("https://andela.com/alc/");




        /*Add in Oncreate() funtion after setContentView()*/
// initiate a web view
        simpleWebView = (WebView) findViewById(R.id.simpleWebView);

// set web view client
        simpleWebView.setWebViewClient(new MyWebViewClient());

// string url which you have to load into a web view
        String url = "https://andela.com/alc/";
        simpleWebView.getSettings().setJavaScriptEnabled(true);
        simpleWebView.loadUrl(url); // load the url on the web view
    }

    // custom web view client class who extends WebViewClient
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url); // load the url
            //progressBar.setVisibility(view.VISIBLE);
            return true;
        }



        // initiate a web view
        WebView simpleWebView=(WebView)findViewById(R.id.simpleWebView);
        // checks whether a web view has a back history item or not
        Boolean canGoBack=simpleWebView.canGoBack();

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }


    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

}

//
