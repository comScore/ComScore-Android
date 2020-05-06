package com.comscore.helloworldexample;

import android.app.Application;

import com.comscore.Analytics;
import com.comscore.PublisherConfiguration;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        PublisherConfiguration publisher = new PublisherConfiguration.Builder()
                .publisherId("1000001")
                .build();

        Analytics.getConfiguration().addClient(publisher);
        Analytics.getConfiguration().enableImplementationValidationMode();
        Analytics.start(getApplicationContext());
    }
}
