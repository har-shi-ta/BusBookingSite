package com.example.pizzahut;

import java.util.Timer;

import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ProgressBar;
public class MainActivity extends Activity implements Runnable
{
	ProgressBar pb;
	MediaPlayer md;
	@Override
	public void onCreate(Bundle ref)
	{
		super.onCreate(ref);
		setContentView(R.layout.activity_main);
		
		md=MediaPlayer.create(this,R.raw.audio);
		md.start();
		
		//SQLiteDatabase db=openOrCreateDatabase("hoteldatabase.db",MODE_PRIVATE,null);
		//db.execSQL("create table hotelsignup(name varchar2(20),userid varchar2(20) primary key"+
	//	"password varchar2(20),gender varchar2(20),dob varchar2(20),"+
		//"emaild varchar2(20),extrafacilities varchar2(20)");
		//db.close();
		
		
		//SQLiteDatabase db=openOrCreateDatabase("hoteldatabase.db", MODE_PRIVATE, null);
		//db.execSQL("create table hotelsignup (name varchar2(20), userid varchar2(20) primary key,password varchar2(20),gender varchar2(20),dob varchar2(20),address varchar2(20),city varchar2(20),contactno varchar2(20),emailid varchar2(20),  extrafacilities varchar2(20)) ");
	//	db.close();
		
		TimerTask tt=new TimerTask()
		{
		
	

    @Override
    public void run(){
			Intent intent=new Intent(MainActivity.this,ChoiceActivity.class);
			startActivity(intent);
		}
		};
		Timer timer=new Timer();
		timer.schedule(tt,5000);//time in ms
		
		Thread th=new Thread(this);
		th.start();
		pb=(ProgressBar)findViewById(R.id.progress);
}

  
    


    @Override
    public void run()
    {
    	try
    	{
    		//pb.setHorizontalScroollBarEnable(true)
    		for(int i=0;i<100;i++)
    		{
    			pb.setProgress(i);
    			Thread.sleep(400);
    			
    		}
    	}catch(Exception ex){}
    }
    @Override
       protected void onStop(){
    	super.onStop();
    	md.stop();
    }
    
}
