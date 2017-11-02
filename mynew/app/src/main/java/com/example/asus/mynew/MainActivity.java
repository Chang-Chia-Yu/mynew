package com.example.asus.mynew;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Handler hand;
    MyView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hand  = new Handler();
       view  = (MyView)findViewById(R.id.myview);
        hand.postDelayed(run, 100);//creat 之後經過100秒後執行
    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            view.invalidate();
            hand.postDelayed(run, 100);
        }
    };
}
