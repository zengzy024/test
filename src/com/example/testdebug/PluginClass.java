package com.example.testdebug;

import com.example.host.Comm;

import android.util.Log;

public class PluginClass implements Comm{

	public PluginClass(){
		Log.i("Plugin", "PluginClass client initialized");
	}
	
	public int function(int a , int b){
		Log.i("Plugin", "PluginClass client initialized");
		return a+b;
	}
}
