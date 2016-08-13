package com.wavenet.dmservice;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {
	public static String LOG ="DM_Daemon Activity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    public void startDM(View mView)
    {
    	Log.d(LOG,"Start DM Click");
    	Intent startIntent = new Intent(this,com.wavenet.dmservice.service.DmProcess.class);
    	this.startService(startIntent);
    }
    
    public void stopDM(View mview)
    {
    	Log.d(LOG,"Close DM Click");
    	Intent stopIntent = new Intent(this,com.wavenet.dmservice.service.DmProcess.class);
    	this.stopService(stopIntent);
    }
  
}
