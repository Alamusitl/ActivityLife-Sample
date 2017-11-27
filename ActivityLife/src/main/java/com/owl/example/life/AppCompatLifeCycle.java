package com.owl.example.life;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by Imagine Owl on 2017/11/21.
 */

public class AppCompatLifeCycle extends AppCompatActivity {


    private static final String TAG = "AppCompatLifeCycle";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appcompat);
        findViewById(R.id.id_btn_back_2_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Log.i(TAG, "AppCompatLifeCycle.onCreate");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i(TAG, "AppCompatLifeCycle.onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "AppCompatLifeCycle.onPostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "AppCompatLifeCycle.onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "AppCompatLifeCycle.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "AppCompatLifeCycle.onDestroy");
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        Log.i(TAG, "AppCompatLifeCycle.onTitleChanged");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "AppCompatLifeCycle.onSaveInstanceState");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i(TAG, "AppCompatLifeCycle.onActivityResult");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "AppCompatLifeCycle.onPause");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, "AppCompatLifeCycle.onNewIntent");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "AppCompatLifeCycle.onResume");
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "AppCompatLifeCycle.onRestoreInstanceState");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "AppCompatLifeCycle.onRestart");
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.i(TAG, "AppCompatLifeCycle.onUserLeaveHint");
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
        Log.i(TAG, "AppCompatLifeCycle.onApplyThemeResource");
    }

    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
        Log.i(TAG, "AppCompatLifeCycle.onChildTitleChanged");
    }
}
