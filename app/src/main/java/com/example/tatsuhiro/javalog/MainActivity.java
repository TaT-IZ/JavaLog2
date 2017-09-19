package com.example.tatsuhiro.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       int[] points = new int[5];
        points[0] = 10;
        points[1] = 35;
        points[2] = 7;
        points[3] = 60;
        points[4] = 0;


        for (int i = 0; i < points.length; i++ );
            Log.d("javatest", String.valueOf(points[i]));

    }
}
