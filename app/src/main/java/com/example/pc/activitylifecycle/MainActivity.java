package com.example.pc.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"in method create");
       }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"in method start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"in method resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"in method pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"in method stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"in method destroy");
    }
}
