package com.owl.example.life;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

/**
 * Created by Imagine Owl on 2017/11/27.
 */

public class DialogActivity extends Activity {

    private static final String TAG = "DialogActivity";
    private Dialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        findViewById(R.id.id_btn_dialog_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.id_btn_dialog_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
        dialog = new AlertDialog.Builder(DialogActivity.this)
                .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create();
        Log.i(TAG, "DialogActivity.onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "DialogActivity.onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "DialogActivity.onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "DialogActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "DialogActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "DialogActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "DialogActivity.onDestroy");
    }
}
