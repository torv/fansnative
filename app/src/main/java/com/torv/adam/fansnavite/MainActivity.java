package com.torv.adam.fansnavite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.torv.adam.so.Secure;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    Secure secure = new Secure();
    tv.setText(secure.getAppKey() + "," + secure.getRedirectUrl());
    }
}
