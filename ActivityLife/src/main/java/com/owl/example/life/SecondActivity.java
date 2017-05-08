package com.owl.example.life;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class SecondActivity extends Activity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG, "SecondActivity onCreate");
        findViewById(R.id.id_btn_back_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "SecondActivity onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "SecondActivity onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "SecondActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "SecondActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "SecondActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SecondActivity onDestroy");
    }
}
