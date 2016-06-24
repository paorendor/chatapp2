package com.example.paorendor.newchatapp.extras;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;



/**
 * Created by PaoRendor on 20/06/16.
 */
public abstract class SplashActivity extends AppCompatActivity {

    private Handler mHandler;

    public abstract int setLayout();

    public abstract int setTimeInSeconds();

    public abstract void init();

    public abstract void done();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        init();
        mHandler = new Handler();
    }

    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            done();
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        mHandler.postDelayed(mRunnable, setTimeInSeconds() * 1000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        removeCallbacks();
    }

    @Override
    protected void onStop() {
        super.onStop();
        removeCallbacks();
    }

    private void removeCallbacks() {
        if (mHandler != null) {
            mHandler.removeCallbacks(mRunnable);
        }
    }
}
