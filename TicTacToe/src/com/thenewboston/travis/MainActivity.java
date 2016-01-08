package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	

	
	

	static MediaPlayer background_song;
	
	Intent intent = new Intent(Intent.ACTION_MAIN);
	
	Button exit;
	Button new_game;
	TextView t;
	Button instruction_;
	Button about_;
	SoundPool click_sound;
	
	int click_soundd=0;
	
	Intent new_game_click=new Intent("com.thenewboston.travis.New_game_click");
	Intent instruction=new Intent("com.thenewboston.travis.Instruction");
	Intent about=new Intent("com.thenewboston.travis.About");

	public void timer()
	{
		 try{
           	 Thread.sleep(2000);
            }catch(InterruptedException e){
           	 e.printStackTrace();
            }
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
		setContentView(R.layout.activity_main);
	
		background_song=MediaPlayer.create(MainActivity.this, R.raw.music);
		
		//background_song.start();
		
				
	if(background_song.isPlaying()==false || background_song.isLooping()==false)
		background_song.start();
		
	
	
	//background_song.
		
		//b1=(ImageButton) findViewById(R.id.btn1);
		
     click_sound=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		
		click_soundd=click_sound.load(this, R.raw.click , 1);
		
		
		new_game=(Button) findViewById(R.id.button1);
		instruction_=(Button) findViewById(R.id.button3);
		about_=(Button) findViewById(R.id.button4);
		
		
		
		t=(TextView) findViewById(R.id.textView1);
		exit=(Button) findViewById(R.id.button2);
	exit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View bu1) {
			// TODO Auto-generated method stub
			if(click_soundd!=0)
				click_sound.play(click_soundd, 1, 1, 0, 0, 1);
			setContentView(R.layout.exit);
		timer();
				
			finish();
			intent.addCategory(Intent.CATEGORY_HOME);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(intent);
		//	finish();
	System.exit(0);
	
		}
	});
	
	
	
	new_game.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
	     
			if(click_soundd!=0)
				click_sound.play(click_soundd, 1, 1, 0, 0, 1);
			startActivity(new_game_click);	
		}
	});
instruction_.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
	     
			if(click_soundd!=0)
				click_sound.play(click_soundd, 1, 1, 0, 0, 1);
			startActivity(instruction);	
		}
	});
about_.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
     
		if(click_soundd!=0)
			click_sound.play(click_soundd, 1, 1, 0, 0, 1);
		//startActivity(about);	
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
