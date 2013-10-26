package com.example.linkedinhack;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * TextViewHelper is a layout that contains a single textview based on user's input
 * TODO: Take options for layout params, color, etc. ?
 * --not for use now
 *
 */
public class StoryHelper {
	private ArrayList<String> mResult;
	private Context cxt;
	private String text;
	private String subtext;
	private LinearLayout mainlayout;

	public StoryHelper(Context cxt, String title, String sub, LinearLayout mainlayout ){
		this.cxt = cxt;
		this.text = title;
		this.subtext = sub;
		this.mainlayout = mainlayout;

		RelativeLayout newstory = (RelativeLayout) View.inflate(cxt,
				R.layout.single_story, null);
		mainlayout.addView(newstory);

		TextView titletext = (TextView) newstory.findViewById(R.id.title);
		titletext.setText(title);
		
		TextView subtext = (TextView) newstory.findViewById(R.id.subtext);
		subtext.setText(sub);
		

	}




}
