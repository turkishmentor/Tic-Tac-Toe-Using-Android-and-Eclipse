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

public class Board_cpu_easy extends Activity{


	int X[][]=new int[3][3];
	int O[][]=new int[3][3];
	int Clicked[][]=new int[3][3];
	
	int flag=0;
	int click_or_not_b1=0,click_or_not_b2=0,click_or_not_b3=0,click_or_not_b4=0,click_or_not_b5=0,click_or_not_b6=0,click_or_not_b7=0,click_or_not_b8=0,click_or_not_b9=0;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button back;
	Button restart;
	Button yes;
	
	int count;
	
	 int x_win=0;
	 int o_win=0;
	
	TextView display;
	TextView congratulation;
	
	SoundPool sp_for_x,sp_for_o;
	
	Intent board=new Intent("com.thenewboston.travis.BOARD");
	Intent new_game_click=new Intent("com.thenewboston.travis.New_game_click");
	Intent x_wi=new Intent("com.thenewboston.travis.X_WIN_CPU");
	Intent o_wi=new Intent("com.thenewboston.travis.O_WIN_CPU");
	Intent match_ti=new Intent("com.thenewboston.travis.MATCH_TIE_CPU");
	
	Intent board_cpu=new Intent("com.thenewboston.travis.Board_cpu");
   
	Random rand =new Random(3);
	
	SoundPool click_sound;
	
	int click_soundd=0;
		
	int sound_for_x=0,sound_for_o=0;
	
	int i,j;
	
	int ro,co;
	
	int draw_counter=0;
	
	
	int b1_x=0,b1_y=0;
	int b2_x=0,b2_y=2;
	int b3_x=0,b3_y=1;
	int b4_x=1,b4_y=0;
	int b5_x=1,b5_y=2;
	int b6_x=1,b6_y=1;
	int b7_x=2,b7_y=0;
	int b8_x=2,b8_y=2;
	int b9_x=2,b9_y=1;
	
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
				else if(draw_counter==9 && x_win==0 && o_win==0)
				{
					startActivity(match_ti);
					//setContentView(R.layout.match_tie);
					//finish();
				}
		}		
	}
	public void timer()
	{
		 try{
           	 Thread.sleep(1000);
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
				else if(draw_counter==9 && o_win==0 && x_win==0)
				{
					startActivity(match_ti);
					//setContentView(R.layout.match_tie);
				}
		}		
	}
	
	public void button_clicked(Button b,int r,int c)
	{	
	if(flag==0)
	{
		draw_counter++;
		X[r][c]=1;
		Clicked[r][c]=1;
		flag=1;
		display.setText("Turn player 2"+ draw_counter);
		b.setBackgroundResource(R.drawable.imagebutton_x);
		if(sound_for_x!=0)
			sp_for_x.play(sound_for_x, 1, 1, 0, 0, 1);	
		
		win_cond_for_x();				
 		win_cond_for_o();
    
		if(draw_counter!=9 && x_win==0 && o_win==0)				
			func(r,c);	
	
			flag=0;
		}
	b.setClickable(false);
	
	}
	
	public synchronized void func(int r,int c)
	{
		
		ro=rand.nextInt(3);   
		co=rand.nextInt(3);    

	if(ro!=r && co!=c)
	{
		if(Clicked[ro][co]!=1)
		{
			O[ro][co]=2;
			Clicked[ro][co]=1;
			
			if(ro==0 && co==0)
			    set_image_and_set_clickable_false(b1);
			else if(ro==0 && co==2)
				set_image_and_set_clickable_false(b2);
			else if(ro==0 && co==1)
				set_image_and_set_clickable_false(b3);
			else if(ro==1 && co==0)
				set_image_and_set_clickable_false(b4);
			else if(ro==1 && co==2)
				set_image_and_set_clickable_false(b5);
			else if(ro==1 && co==1)
				set_image_and_set_clickable_false(b6);
			else if(ro==2 && co==0)
				set_image_and_set_clickable_false(b7);
			else if(ro==2 && co==2)
				set_image_and_set_clickable_false(b8);
			else if(ro==2 && co==1)
				set_image_and_set_clickable_false(b9);	
			
		}
		else
			func(r,c);
	}
	else
		func(r,c);
		
	
	}
	
	public void set_image_and_set_clickable_false(Button b)
	{
		if(sound_for_o!=0)
			sp_for_o.play(sound_for_o, 1, 1, 0, 0, 1);
		draw_counter++;
		b.setBackgroundResource(R.drawable.imagebutton_o);
		b.setClickable(false);
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
				startActivity(board_cpu);
			}
		});
	



		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//display.setText("b1 clicked"+ draw_counter);
		
			button_clicked(b1,b1_x,b1_y);		
			
					
				
				
				
			}
		});
		
	b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			//	display.setText("b2 clicked"+ draw_counter);
			
					
					
					button_clicked(b2,b2_x,b2_y);
					win_cond_for_x();			
					win_cond_for_o();
				
			}
		});
	
	b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		//	display.setText("b3 clicked"+ draw_counter);
		
				
			
				button_clicked(b3,b3_x,b3_y);
				win_cond_for_x();		
				win_cond_for_o();
			
		}
	});

	b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		//	display.setText("b4 clicked"+ draw_counter);
			
			
				
				
				button_clicked(b4,b4_x,b4_y);
				win_cond_for_x();
				win_cond_for_o();
			 
			
		}
	});
	
b5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		//	display.setText("b5 clicked"+ draw_counter);
		
				
				button_clicked(b5,b5_x,b5_y);
				win_cond_for_x();		
				win_cond_for_o();
			
		}
	});

b6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	//	display.setText("b6 clicked"+ draw_counter);
		
			
			button_clicked(b6,b6_x,b6_y);
			win_cond_for_x();		
			win_cond_for_o();
		
	}
});
	
b7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
	//	display.setText("b7 clicked"+ draw_counter);
		
	
			 button_clicked(b7,b7_x,b7_y);
			 win_cond_for_x();
			win_cond_for_o();
		
		
	}
});

b8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	
		
			button_clicked(b8,b8_x,b8_y);
			win_cond_for_x();				
			win_cond_for_o();
		
	}
});

b9.setOnClickListener(new View.OnClickListener() {

@Override

public void onClick(View arg0) {
	// TODO Auto-generated method stub
		button_clicked(b9,b9_x,b9_y);
		win_cond_for_x();
		win_cond_for_o();
}
});
	}
}
