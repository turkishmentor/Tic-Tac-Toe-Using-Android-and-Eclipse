package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Difficulty extends Activity{

	
	
	
	
	Button easy,medium,hard,back;
	
SoundPool click_sound;
	
	int click_soundd=0;
	
	int back_soundd=0;

	
	Intent board_cpu_easy=new Intent("com.thenewboston.travis.Board_cpu");
	Intent board_cpu_medium=new Intent("com.thenewboston.travis.Board_cpu_medium");
	Intent board_cpu_hard=new Intent("com.thenewboston.travis.Board_cpu_hard");
	Intent new_game_click=new Intent("com.thenewboston.travis.New_game_click");
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
		setContentView(R.layout.difficulty);
		
	
		
click_sound=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		
		click_soundd=click_sound.load(this, R.raw.click , 1);
		
		back_soundd=click_sound.load(this, R.raw.back , 1);
	
          easy=(Button) findViewById(R.id.easy);
          
          medium=(Button) findViewById(R.id.medium);
		
		hard=(Button) findViewById(R.id.hard);
		
		back=(Button) findViewById(R.id.back);
		
		
easy.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				if(click_soundd!=0)
					click_sound.play(click_soundd, 1, 1, 0, 0, 1);
				
				startActivity(board_cpu_easy);
				
				
			}
		});
medium.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		if(click_soundd!=0)
			click_sound.play(click_soundd, 1, 1, 0, 0, 1);
		
		startActivity(board_cpu_medium);
		
		
	}
});
		
hard.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(click_soundd!=0)
					click_sound.play(click_soundd, 1, 1, 0, 0, 1);	
				
				startActivity(board_cpu_hard);
				
			
			}
		});
	
back.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(click_soundd!=0)
			click_sound.play(back_soundd, 1, 1, 0, 0, 1);
		
		startActivity(new_game_click);
	}
});
	
	
	}

}
