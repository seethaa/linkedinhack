package com.example.linkedinhack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
 
public class OftenQ extends Activity {
	
	private static LinearLayout mainlayout;
	private ImageView malebutton;
	private ImageView femalebutton;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.field_interest);
		
		 
		malebutton = (ImageView) findViewById(R.id.menimg);
		 
		malebutton.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			   Toast.makeText(OftenQ.this,
				"biz is clicked!", Toast.LENGTH_SHORT).show();
 
			   Intent intent = new Intent(OftenQ.this, OftenQ.class);
				startActivity(intent);
			}
 
		});
		
		femalebutton = (ImageView) findViewById(R.id.womenimg);
		 
		femalebutton.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			   Toast.makeText(OftenQ.this,
				"tech is clicked!", Toast.LENGTH_SHORT).show();
			   
			   Intent intent = new Intent(OftenQ.this, OftenQ.class);
				startActivity(intent);
 
			}
 
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
 
}
