package com.example.administrator.hotrepairdemo.dex.main;


import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.example.administrator.hotrepairdemo.dn.fixutils.FixDexUtils;

import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;

public class MyApplication extends Application{
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}
	@Override
	protected void attachBaseContext(Context base) {
		// TODO Auto-generated method stub
		MultiDex.install(base);
		FixDexUtils.loadFixedDex(base);
		super.attachBaseContext(base);

	}
}
