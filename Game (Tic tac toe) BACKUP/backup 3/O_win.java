package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class O_win extends Activity{
	
	
	Intent board=new Intent("com.thenewboston.travis.BOARD");
	Intent main=new Intent("com.thenewboston.travis.MainActivity");
	
	Intent board_cpu=new Intent("com.thenewboston.travis.Board_cpu");
	
	Button Yes;
	Button no;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.o_wins);
	
		 Yes=(Button) findViewById(R.id.yes);
		   no=(Button) findViewById(R.id.no);
		   
		   Yes.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
				
						startActivity(board);
					
				}
			});
			no.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					startActivity(main);
				}
			});	   
	
	}

}
