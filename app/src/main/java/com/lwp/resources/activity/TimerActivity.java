package com.lwp.resources.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lwp.resources.R;

import java.util.Timer;
import java.util.TimerTask;

public class TimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
    }

    @Override
    protected void onResume() {
        super.onResume();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                // 定时跳转
                finish();
            }
        }, 3000);
    }
}
