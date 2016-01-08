package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Starting_page extends Activity{

	MediaPlayer background_music;
	
		
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		
		setContentView(R.layout.starting_page);
		
		background_music=MediaPlayer.create(Starting_page.this, R.raw.starting1);
		background_music.start();
	
	
		Thread timer= new Thread(){
			   
			 public void run(){
                try{
               	 Thread.sleep(3000);
                }catch(InterruptedException e){
               	 e.printStackTrace();
                }finally{
               	 
               	 Intent main_menu=new Intent("com.thenewboston.travis.MainActivity");
               	 startActivity(main_menu);
                }
			 }
		};
		timer.start();
	
	
	
	}

	
}
