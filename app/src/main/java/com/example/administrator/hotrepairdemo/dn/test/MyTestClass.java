package com.example.administrator.hotrepairdemo.dn.test;


import android.content.Context;
import android.widget.Toast;

public class MyTestClass {
	public  void testFix(Context context){
		int i = 10;
		int a = 0;
		Toast.makeText(context, "shit:"+i/a, Toast.LENGTH_SHORT).show();
	}
}
