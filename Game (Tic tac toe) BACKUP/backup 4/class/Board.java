package com.thenewboston.travis;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Board extends Activity{


	int X[][]=new int[3][3];
	int O[][]=new int[3][3];
	
	int flag=0;
	int click_or_not_b1=0,click_or_not_b2=0,click_or_not_b3=0,click_or_not_b4=0,click_or_not_b5=0,click_or_not_b6=0,click_or_not_b7=0,click_or_not_b8=0,click_or_not_b9=0;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button back;
	Button restart;
	Button yes;
	
	TextView display;
	TextView congratulation;
	
	SoundPool sp_for_x,sp_for_o;
	

	Intent board=new Intent("com.thenewboston.travis.BOARD");
	Intent new_game_click=new Intent("com.thenewboston.travis.New_game_click");
	Intent x_wi=new Intent("com.thenewboston.travis.X_WIN");
	Intent o_wi=new Intent("com.thenewboston.travis.O_WIN");
	Intent match_ti=new Intent("com.thenewboston.travis.MATCH_TIE");
   
	Random rand =new Random(35);
	
	
	int count;
	SoundPool click_sound;
	
	int click_soundd=0;
		
	int sound_for_x=0,sound_for_o=0;
	
	int i,j;
	
	int draw_counter=0;
	
	int x_win=0,o_win=0; 
	
	int btn1_x=0,btn1_y=0;
	int btn2_x=0,btn2_y=1;
	int btn3_x=0,btn3_y=2;
	int btn4_x=1,btn4_y=0;
	int btn5_x=1,btn5_y=1;
	int btn6_x=1,btn6_y=2;
	int btn7_x=2,btn7_y=0;
	int btn8_x=2,btn8_y=1;
	int btn9_x=2,btn9_y=2;
	
	public synchronized void win_cond_for_x()
	{
		for(i=0;i<=2;i++)
		{
			
				if(i==0 && (X[i][0]==1 && X[i][1]==1 && X[i][2]==1))
				{
					x_win=1;
					b1.setBackgroundResource(R.drawable.win_x);
					b2.setBackgroundResource(R.drawable.win_x);
					b3.setBackgroundResource(R.drawable.win_x);
					timer();
					startActivity(x_wi);
					//setContentView(R.layout.x_wins);
					//congratulation.setTextColor(Color.MAGENTA);			
				//	finish();
				}
				else if(i==1 && (X[i][0]==1 && X[i][1]==1 && X[i][2]==1))
				{
					x_win=1;
					b4.setBackgroundResource(R.drawable.win_x);
					b5.setBackgroundResource(R.drawable.win_x);
					b6.setBackgroundResource(R.drawable.win_x);
					timer();
					startActivity(x_wi);
					//setContentView(R.layout.x_wins);
					//congratulation.setTextColor(Color.MAGENTA);			
				//	finish();
				}
				else if(i==2 && (X[i][0]==1 && X[i][1]==1 && X[i][2]==1))
				{
					x_win=1;
					b7.setBackgroundResource(R.drawable.win_x);
					b8.setBackgroundResource(R.drawable.win_x);
					b9.setBackgroundResource(R.drawable.win_x);
					timer();
					startActivity(x_wi);
					//setContentView(R.layout.x_wins);
					//congratulation.setTextColor(Color.MAGENTA);			
				//	finish();
				}
				else if(i==0 && (X[0][i]==1 && X[1][i]==1 && X[2][i]==1))
				{
					x_win=1;
					b1.setBackgroundResource(R.drawable.win_x);
					b4.setBackgroundResource(R.drawable.win_x);
					b7.setBackgroundResource(R.drawable.win_x);
					timer();
					startActivity(x_wi);
					//setContentView(R.layout.x_wins);
					//congratulation.setTextColor(Color.MAGENTA);
					//finish();
				}
				else if(i==1 && (X[0][i]==1 && X[1][i]==1 && X[2][i]==1))
				{
					x_win=1;
					b3.setBackgroundResource(R.drawable.win_x);
					b6.setBackgroundResource(R.drawable.win_x);
					b9.setBackgroundResource(R.drawable.win_x);
					timer();
					startActivity(x_wi);
					//setContentView(R.layout.x_wins);
					//congratulation.setTextColor(Color.MAGENTA);
					//finish();
				}
				else if(i==2 && (X[0][i]==1 && X[1][i]==1 && X[2][i]==1))
				{
					x_win=1;
					b2.setBackgroundResource(R.drawable.win_x);
					b5.setBackgroundResource(R.drawable.win_x);
					b8.setBackgroundResource(R.drawable.win_x);
					timer();
					startActivity(x_wi);
					//setContentView(R.layout.x_wins);
					//congratulation.setTextColor(Color.MAGENTA);
					//finish();
				}
				else if(i==0)
				{
					if(X[i][i]==1 && X[i+1][i+1]==1 && X[i+2][i+2]==1)
					{
						x_win=1;
						b1.setBackgroundResource(R.drawable.win_x);
						b6.setBackgroundResource(R.drawable.win_x);
						b8.setBackgroundResource(R.drawable.win_x);
						timer();
						startActivity(x_wi);
						//setContentView(R.layout.x_wins);
						//congratulation.setTextColor(Color.MAGENTA);   
					}	
						//	finish();
					else if(X[i][i+2]==1 && X[i+1][i+1]==1 && X[i+2][i]==1)
					
						{
						x_win=1;
						b2.setBackgroundResource(R.drawable.win_x);
						b6.setBackgroundResource(R.drawable.win_x);
						b7.setBackgroundResource(R.drawable.win_x);
						timer();
						startActivity(x_wi);
					//	congratulation.setTextColor(Color.MAGENTA);
						//setContentView(R.layout.x_wins);
						}
				}
				
		}	
		if(this.draw_counter==9 && x_win==0 && o_win==0)
		{
			startActivity(match_ti);
			//setContentView(R.layout.match_tie);
			//finish();
		}
		
	}
	public void timer()
	{
		 try{
           	 Thread.sleep(1500);
            }catch(InterruptedException e){
           	 e.printStackTrace();
            }
	}
	public synchronized void win_cond_for_o()
	{
		for(i=0;i<=2;i++)
		{
			
				if(i==0 && (O[i][0]==2 && O[i][1]==2 && O[i][2]==2))
				{
					o_win=1;
					b1.setBackgroundResource(R.drawable.win_o);
					b2.setBackgroundResource(R.drawable.win_o);
					b3.setBackgroundResource(R.drawable.win_o);
					timer();
					startActivity(o_wi);
					//setContentView(R.layout.o_wins);
					//alertDialog.show();
				//	finish();
				}
				else if(i==1 && (O[i][0]==2 && O[i][1]==2 && O[i][2]==2))
				{
					o_win=1;
					b4.setBackgroundResource(R.drawable.win_o);
					b5.setBackgroundResource(R.drawable.win_o);
					b6.setBackgroundResource(R.drawable.win_o);
					timer();
					startActivity(o_wi);
					//setContentView(R.layout.o_wins);
					//alertDialog.show();
				//	finish();
				}
				else if(i==2 && (O[i][0]==2 && O[i][1]==2 && O[i][2]==2))
				{
					o_win=1;
					b7.setBackgroundResource(R.drawable.win_o);
					b8.setBackgroundResource(R.drawable.win_o);
					b9.setBackgroundResource(R.drawable.win_o);
					timer();
					startActivity(o_wi);
					//setContentView(R.layout.o_wins);
					//alertDialog.show();
				//	finish();
				}
				else if(i==0 && (O[0][i]==2 && O[1][i]==2 && O[2][i]==2))
				{
					o_win=1;
					b1.setBackgroundResource(R.drawable.win_o);
					b4.setBackgroundResource(R.drawable.win_o);
					b7.setBackgroundResource(R.drawable.win_o);
					timer();
					startActivity(o_wi);
				//	setContentView(R.layout.o_wins);
				//	finish();
				}
				else if(i==1 && (O[0][i]==2 && O[1][i]==2 && O[2][i]==2))
				{
					o_win=1;
					b3.setBackgroundResource(R.drawable.win_o);
					b6.setBackgroundResource(R.drawable.win_o);
					b9.setBackgroundResource(R.drawable.win_o);
					timer();
					startActivity(o_wi);
				//	setContentView(R.layout.o_wins);
				//	finish();
				}
				else if(i==2 && (O[0][i]==2 && O[1][i]==2 && O[2][i]==2))
				{
					o_win=1;
					b2.setBackgroundResource(R.drawable.win_o);
					b5.setBackgroundResource(R.drawable.win_o);
					b8.setBackgroundResource(R.drawable.win_o);
					timer();
					startActivity(o_wi);
				//	setContentView(R.layout.o_wins);
				//	finish();
				}
				else if(i==0)
				{
					if(O[i][i]==2 && O[i+1][i+1]==2 && O[i+2][i+2]==2)
					{
						o_win=1;
						b1.setBackgroundResource(R.drawable.win_o);
						b6.setBackgroundResource(R.drawable.win_o);
						b8.setBackgroundResource(R.drawable.win_o);
						timer();
						startActivity(o_wi);
						//setContentView(R.layout.o_wins);	
					}
					
					else if(O[i][i+2]==2 && O[i+1][i+1]==2 && O[i+2][i]==2)
					{
						o_win=1;
						b2.setBackgroundResource(R.drawable.win_o);
						b6.setBackgroundResource(R.drawable.win_o);
						b7.setBackgroundResource(R.drawable.win_o);
						timer();
						startActivity(o_wi);
					}
				}	
		}	
		if(this.draw_counter==9 && x_win==0 && o_win==0)
		{
			startActivity(match_ti);
			//setContentView(R.layout.match_tie);
		}
	}
	
	public void button_clicked(Button b)
	{	
		
	
	if(flag==0)
	{
		flag=1;
		display.setText("Turn player 2");
		b.setBackgroundResource(R.drawable.imagebutton_x);
		if(sound_for_x!=0)
			sp_for_x.play(sound_for_x, 1, 1, 0, 0, 1);
		
	}	
		else if(flag==1)
		{
			flag=0;
			display.setText("Turn player 1");
			b.setBackgroundResource(R.drawable.imagebutton_o);
			if(sound_for_o!=0)
				sp_for_o.play(sound_for_o, 1, 1, 0, 0, 1);
		}
	b.setClickable(false);
	draw_counter++;
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.board);
		
	sp_for_x=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		
		this.sound_for_x=this.sp_for_x.load(this, R.raw.x , 1);
	
	sp_for_o=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		
		this.sound_for_o=this.sp_for_o.load(this, R.raw.o , 1);
		
		 click_sound=new SoundPool(5,AudioManager.STREAM_MUSIC,0);
			
			click_soundd=click_sound.load(this, R.raw.click , 1);
		
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			X[i][j]=0;
		}
	}
		
		b1=(Button) findViewById(R.id.btn1);
		b2=(Button) findViewById(R.id.btn2);
		b3=(Button) findViewById(R.id.btn3);
		b4=(Button) findViewById(R.id.btn4);
		b5=(Button) findViewById(R.id.btn5);
		b6=(Button) findViewById(R.id.btn6);
		b7=(Button) findViewById(R.id.btn7);
		b8=(Button) findViewById(R.id.btn8);
		b9=(Button) findViewById(R.id.btn9);
		
		back=(Button) findViewById(R.id.back);
		
		restart=(Button) findViewById(R.id.restart);
	
	
	
		display=(TextView) findViewById(R.id.textView1);
		congratulation=(TextView) findViewById(R.id.congratulation);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(click_soundd!=0)
					click_sound.play(click_soundd, 1, 1, 0, 0, 1);
				
				startActivity(new_game_click);
			}
		});
restart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(click_soundd!=0)
					click_sound.play(click_soundd, 1, 1, 0, 0, 1);
				
				finish();
				startActivity(board);
			}
		});
	



		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				display.setText("b1 clicked"+ draw_counter);
				
				if(flag==0)
				{
					X[0][0]=1;
					
					
		
			button_clicked(b1);		
			win_cond_for_x();

				
				}
				else if(flag==1)
				{
					O[0][0]=2;
					
				
					
					button_clicked(b1);
					win_cond_for_o();
					
				}
				
				
			}
		});
		
	b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				display.setText("b2 clicked"+ draw_counter);
				if(flag==0)
				{
					X[0][2]=1;
					
					
					button_clicked(b2);
					win_cond_for_x();
	
				}
				else if(flag==1)
				{
					O[0][2]=2;
				
					button_clicked(b2);
					win_cond_for_o();
				}
			}
		});
	
	b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			display.setText("b3 clicked"+ draw_counter);
			if(flag==0)
			{
				X[0][1]=1;
				
			
				button_clicked(b3);
				win_cond_for_x();
			}
			else if(flag==1)
			{
				O[0][1]=2;
				
				button_clicked(b3);
				win_cond_for_o();
			}
		}
	});

	b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			display.setText("b4 clicked"+ draw_counter);
			
			if(flag==0)
			{
				
				X[1][0]=1;
				
				
				button_clicked(b4);
				win_cond_for_x();
			}
			else if(flag==1)
			{ 
				O[1][0]=2;
			
				button_clicked(b4);
				win_cond_for_o();
			 }
			
		}
	});
	
b5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			display.setText("b5 clicked"+ draw_counter);
			if(flag==0)
			{
				X[1][2]=1;
				
				
				button_clicked(b5);
				win_cond_for_x();
			}
			else if(flag==1)
			{
				O[1][2]=2;
				
				button_clicked(b5);
				win_cond_for_o();
			}
		}
	});

b6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		display.setText("b6 clicked"+ draw_counter);
		if(flag==0)
		{
			X[1][1]=1;
		
			
			button_clicked(b6);
			win_cond_for_x();
		}
		else if(flag==1)
		{
			O[1][1]=2;
		
			button_clicked(b6);
			win_cond_for_o();
		}
	}
});
	
b7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		display.setText("b7 clicked"+ draw_counter);
		
		if(flag==0)
		{
			 X[2][0]=1;
			
			
			 button_clicked(b7);
			 win_cond_for_x();
		}
		else if(flag==1)
		{
			O[2][0]=2;
		
			button_clicked(b7);
			win_cond_for_o();
		}
		
	}
});

b8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//display.setText("b8 clicked"+ draw_counter);
		if(flag==0)
		{
			
			
			X[2][2]=1;
			
			
		
		
			button_clicked(b8);
			win_cond_for_x();				

		}
		else if(flag==1)
		{
			O[2][2]=2;
		
			button_clicked(b8);
			win_cond_for_o();
		}
	}
});

b9.setOnClickListener(new View.OnClickListener() {

@Override

public void onClick(View arg0) {
	// TODO Auto-generated method stub
	display.setText("b9 clicked"+ draw_counter);
	if(flag==0)
	{
		X[2][1]=1;
		
		
		button_clicked(b9);
		win_cond_for_x();
/*		display.setText("Turn player 2");
		draw_counter++;
		if(sound_for_x!=0)
			sp_for_x.play(sound_for_x, 1, 1, 0, 0, 1);
		
		b9.setClickable(false);
		flag=1;
		b9.setBackgroundResource(R.drawable.imagebutton_x);
		b9.setText(""+X[2][1]);
	*/
	}
	else if(flag==1)
	{
		O[2][1]=2;
		
		button_clicked(b9);
		win_cond_for_o();
	/*	display.setText("Turn player 1");
		
		draw_counter++;
		if(sound_for_o!=0)
			sp_for_o.play(sound_for_o, 1, 1, 0, 0, 1);

		
		b9.setClickable(false);
		flag=0;
		b9.setBackgroundResource(R.drawable.imagebutton_o);
	*/
	}
}
});
	}
}
