package com.owl.example.life;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Imagine Owl on 2017/11/27.
 */

public class TransparentActivity extends Activity {

    private static final String TAG = "TransparentActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
        Log.i(TAG, "TransparentActivity.onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "TransparentActivity.onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "TransparentActivity.onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "TransparentActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "TransparentActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "TransparentActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "TransparentActivity.onDestroy");
    }
}
