package com.ccg.multidexsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ccg.multidexsample.method.FirstMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstMethod firstMethod = new FirstMethod();
        firstMethod.method1();
    }
}
