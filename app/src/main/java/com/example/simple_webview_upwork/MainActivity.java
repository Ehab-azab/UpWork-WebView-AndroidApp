package com.example.simple_webview_upwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext() ,the_Web_View.class);
                startActivity(intent);
                //This 'finish()' is for exiting the app when back button pressed from Home page which is ActivityHome
                MainActivity.this.finish();
            }
        },3000);
    }
}