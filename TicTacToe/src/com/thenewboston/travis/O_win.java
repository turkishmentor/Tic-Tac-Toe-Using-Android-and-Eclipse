package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class O_win extends Activity{
	
	MediaPlayer background_music;
	
	Intent board=new Intent("com.thenewboston.travis.BOARD");
	Intent main=new Intent("com.thenewboston.travis.MainActivity");
	
	Intent board_cpu=new Intent("com.thenewboston.travis.Board_cpu");
	
	Button Yes;
	Button no;
	
	SoundPool click_sound;
	int click_soundd=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
		setContentView(R.layout.o_win_player_vs_player);
		background_music=MediaPlayer.create(O_win.this, R.raw.player_win_sound);
		background_music.start();
		
click_sound=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		
		click_soundd=click_sound.load(this, R.raw.click , 1);
	
		 Yes=(Button) findViewById(R.id.yes);
		   no=(Button) findViewById(R.id.no);
		   
		   Yes.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(click_soundd!=0)
						click_sound.play(click_soundd, 1, 1, 0, 0, 1);
					
						startActivity(board);
					
				}
			});
			no.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					if(click_soundd!=0)
						click_sound.play(click_soundd, 1, 1, 0, 0, 1);
					startActivity(main);
				}
			});	   
	
	}

}
