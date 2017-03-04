package com.example.tianfei.myjni_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public native String displayJni();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, displayJni(), Toast.LENGTH_LONG).show();
    }

    static {
        System.loadLibrary("jniTest");
    }
}
