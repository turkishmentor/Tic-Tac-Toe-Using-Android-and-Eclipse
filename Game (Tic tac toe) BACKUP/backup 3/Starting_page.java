package com.thenewboston.travis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Starting_page extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.starting_page);
	
	
		Thread timer= new Thread(){
			   
			 public void run(){
                try{
               	 Thread.sleep(10);
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
