package com.wavenet.dmservice.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class DmProcess extends Service{
	public static String LOG ="DM_Daemon Service";
	public int chidPid = 0;

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) 
	{
		// TODO Auto-generated method stub
		chidPid = initDM();
		Log.d(LOG,"Child Process Id =" +chidPid);
		return 0 ;
	}
	
	@Override
	public void onDestroy() 
	{
		Log.d(LOG,"Parent Process id = "+android.os.Process.myPid());
		android.os.Process.killProcess(android.os.Process.myPid());
	}

	private native int initDM();
	
	private native int closeDM();
	
static
	{
		  System.loadLibrary("DMService");
	}

}
