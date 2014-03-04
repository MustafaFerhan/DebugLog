package com.mustafaferhan.debuglog_demo;

import android.app.Activity;
import android.os.Bundle;

import com.mustafaferhan.debuglog.DebugLog;

/***
 * @since Mar 5, 2014 - 1:06:32 AM
 * @author Mustafa Ferhan Akman
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DebugLog.e("simple log from onCreate()");
		
		myFunc();
		mySecondFunc();
	}

	void myFunc(){
		DebugLog.e("simple log from myFunc()");
	}
	
	void mySecondFunc(){
		DebugLog.i("simple log from mySecondFunc()");
	}
	
	@Override
	protected void onResume() {
		super.onResume();

		DebugLog.v("v log");
		DebugLog.w("w log");
		DebugLog.wtf("wtf log");
	}

}
