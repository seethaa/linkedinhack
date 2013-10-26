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

		StoryHelper sh = new StoryHelper(this, "LinkedIn builds its 'engineering brand' by hosting female-focused hackdays ",
				"LinkedIn brings out the best in talent! ~Jeff Weiner	| 30min ago", mainlayout, "developher");

		StoryHelper sh2 = new StoryHelper(this, "Wishbone Lets Kids Apply To Have Their Educations Crowdfunded",
				"Great opportunity for kids ~Ying Li	| 2hr ago ", mainlayout, "wishbone" );

		StoryHelper sh3 = new StoryHelper(this, "Y Combinator Startups Now Have A Combined Valuation Of $13.7 Billion, Up $2 Billion "

+"Since June ", "3 of your friends like this.	| 6 hr ago ", mainlayout, "ycombinator");

		StoryHelper sh4 = new StoryHelper(this, "GoldieBlox -- Get Hooked on Engineering!",
			"Great gift idea! ~ Shannon Stubo| 4 likes in your area	| Yesterday ", mainlayout, "goldieblox");
		
		StoryHelper sh5 = new StoryHelper(this, "7 CEOs You Must Know",
				"45 Likes	| Two days ago", mainlayout, "ceopic");
		
		StoryHelper sh8 = new StoryHelper(this, "Twitter Announces NBC’s Vivian Schiller As Head Of News Partnerships", "4 likes from LinkedIn	| Oct 23rd", mainlayout, "collegenew");


		StoryHelper sh6 = new StoryHelper(this, "It's Not About Checking the Box, Dick -- It's Just Good Business!", 
				"Costolo goes wrong. ~Business Insider	| Oct 23rd", mainlayout, "twitterceo");

		StoryHelper sh7 = new StoryHelper(this, "H2O-Pal Helps You Get Your Two Gallons Of Water A Day", 
				"Stay hidrated!	| Oct 22rd", mainlayout, "h20");


		StoryHelper sh9 = new StoryHelper(this, "Can your neice change the world?", "5 people liked this.	| long ago", mainlayout, "teachgirltocode");


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
