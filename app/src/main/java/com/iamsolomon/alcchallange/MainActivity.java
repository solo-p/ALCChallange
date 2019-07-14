package com.iamsolomon.alcchallange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    //WebView simpleWebView;
    private static Button simpleWebView;
    private static Button buttonProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        simpleWebView = findViewById(R.id.simpleWebView);
        buttonProfile = findViewById(R.id.buttonProfile);

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });


    }


    public void AboutActivity(View v) {
        Intent intent =new Intent(this, AboutActivity.class);
        startActivity(intent);

    }






}
