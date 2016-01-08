package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class O_win_cpu_hard extends Activity{

	Intent board_cpu_hard=new Intent("com.thenewboston.travis.Board_cpu_hard");
	Intent main=new Intent("com.thenewboston.travis.MainActivity");
	

	
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
		
		startActivity(board_cpu_hard);
		
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
