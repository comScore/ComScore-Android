package com.example.helloworldexample;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

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
		Analytics.start(getApplicationContext());

		if(isTrackingLimited()) {
			Analytics.getConfiguration().disable();
		}
	}

	private Boolean isTrackingLimited () {
		SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
		return sharedPref.getBoolean(SettingsActivity.KEY_PREF_TRACKING_DISABLED, false);
	}
}
