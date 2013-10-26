package com.example.linkedinhack;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	private static LinearLayout mainlayout;
 
	@Override 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_vert_lin_layout);
		
		mainlayout = (LinearLayout) findViewById(R.id.mainLayout);
		
		//get stories and show them.
		
		StoryHelper sh = new StoryHelper(this, "Facebook's Mark Zuckerberg reportedly wanted to acquire Snapchat in deal worth more than $1 million ", "What was he thinking??", mainlayout);

		StoryHelper sh2 = new StoryHelper(this, "Facebook's Mark Zuckerberg reportedly wanted to acquire Snapchat in deal worth more than $1 million ", "What was he thinking??", mainlayout);

		StoryHelper sh3 = new StoryHelper(this, "Facebook's Mark Zuckerberg reportedly wanted to acquire Snapchat in deal worth more than $1 million ", "What was he thinking??", mainlayout);

		StoryHelper sh4 = new StoryHelper(this, "Facebook's Mark Zuckerberg reportedly wanted to acquire Snapchat in deal worth more than $1 million ", "What was he thinking??", mainlayout);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
 
}
