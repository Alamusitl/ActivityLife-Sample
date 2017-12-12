package com.owl.example.life;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

/**
 * Created by Imagine Owl on 2017/12/12.
 */

public class SingleActivity extends Activity {
    private static final String TAG = "SingleActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        Log.i(TAG, "process Id: " + Process.myPid());
        Log.i(TAG, "user Id: " + Process.myUid());
        Log.i(TAG, "thread Id: " + Process.myTid());

        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            assert am != null;
            List<ActivityManager.AppTask> appTasks = am.getAppTasks();
            for (ActivityManager.AppTask task :
                    appTasks) {
                Log.i(TAG, "" + task.getTaskInfo().id);
            }
        }
    }
}
