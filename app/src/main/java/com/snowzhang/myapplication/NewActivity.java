package com.snowzhang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        System.out.print("hhhh");
        String applicationId = BuildConfig.APPLICATION_ID;
    }
}
