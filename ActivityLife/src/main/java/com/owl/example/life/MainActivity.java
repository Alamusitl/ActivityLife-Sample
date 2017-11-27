package com.owl.example.life;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity onCreate");
        findViewById(R.id.id_btn_to_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.id_btn_to_appcompat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AppCompatLifeCycle.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.id_btn_to_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.id_btn_to_transparent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransparentActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "MainActivity onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity onDestroy");
    }
}
