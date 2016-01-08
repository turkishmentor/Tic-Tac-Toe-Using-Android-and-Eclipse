package com.thenewboston.travis;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instruction extends Activity {

	Button back;
	
SoundPool click_sound;
	
	int click_soundd=0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instruction);

click_sound=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		
		click_soundd=click_sound.load(this, R.raw.click , 1);

		back=(Button) findViewById(R.id.back);
		
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(click_soundd!=0)
					click_sound.play(click_soundd, 1, 1, 0, 0, 1);
				
				finish();
			}
		});

	}

}
