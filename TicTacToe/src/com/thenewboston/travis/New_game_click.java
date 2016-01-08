package com.thenewboston.travis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class New_game_click extends Activity{

	
	
	Button player_vs_player;
	Button player_vs_CPU;
	Button back;
	
	SoundPool click_sound;
	
	int click_soundd=0;
	int back_soundd=0;
	
	Intent board=new Intent("com.thenewboston.travis.BOARD");
	Intent difficulty=new Intent("com.thenewboston.travis.Difficulty");
	Intent main=new Intent("com.thenewboston.travis.MainActivity");
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
		setContentView(R.layout.newgame_click);
		
		
        click_sound=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		
		click_soundd=click_sound.load(this, R.raw.click , 1);
		
		back_soundd=click_sound.load(this, R.raw.back , 1);
		
		
		player_vs_player=(Button) findViewById(R.id.btn1);
		
		player_vs_CPU=(Button) findViewById(R.id.btn2);
		
		back=(Button) findViewById(R.id.back);
	
		player_vs_player.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				if(click_soundd!=0)
					click_sound.play(click_soundd, 1, 1, 0, 0, 1);
				
				startActivity(board);
				
				
			}
		});
		
player_vs_CPU.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(click_soundd!=0)
					click_sound.play(click_soundd, 1, 1, 0, 0, 1);	
				startActivity(difficulty);
				
			
			}
		});
	
back.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(click_soundd!=0)
			click_sound.play(back_soundd, 1, 1, 0, 0, 1);
		
		startActivity(main);
		
		
	}
});
	}

	
	
}
