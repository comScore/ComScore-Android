package com.example.helloworldexample;

import com.comscore.Analytics;

import android.app.Activity;

public class BaseActivity extends Activity{
	
    @Override
    protected void onResume() {
        super.onResume();
        Analytics.notifyEnterForeground();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Analytics.notifyExitForeground();
    }

}
