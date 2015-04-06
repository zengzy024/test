package com.example.testdebug;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("log", "test git");
		Log.i("log", "three");
		Log.i("log", "sourcetree 测试");
		Log.i("log", "pull 测试");
		String ces = "只是为了测试git的相应功能实现";
		Toast.makeText(this, ces, Toast.LENGTH_SHORT).show();;
	}

	
}
