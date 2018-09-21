package me.thanongsine.androiddemotutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        String msg = getIntent().getStringExtra("myMsg");
        Log.e("IntentMsgLog", "MyMsg = " + msg);

        Log.e("ActivityLifeCycleLog", "OnCreate");
    }

    @Override
    protected void onStart() {
        Log.e("ActivityLifeCycleLog", "OnStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.e("ActivityLifeCycleLog", "OnRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.e("ActivityLifeCycleLog", "OnResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("ActivityLifeCycleLog", "OnPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("ActivityLifeCycleLog", "OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("ActivityLifeCycleLog", "OnDestroy");
        super.onDestroy();
    }
}
