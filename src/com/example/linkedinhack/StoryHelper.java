package com.example.linkedinhack;

import java.util.ArrayList;


import android.content.Context;
import android.view.View;
import android.widget.ImageView;
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

	public StoryHelper(Context cxt, String title, String sub, LinearLayout mainlayout, String img_str ){
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
		
		ImageView story_img = (ImageView) newstory.findViewById(R.id.storypic); // start time
		
		if (img_str.toString().equalsIgnoreCase("developher")){
			story_img.setImageResource(R.drawable.developher);
		}
		else if(img_str.toString().equalsIgnoreCase("wishbone")){
			story_img.setImageResource(R.drawable.wishbone);
		}
		else if (img_str.toString().equalsIgnoreCase("ycombinator")){
			story_img.setImageResource(R.drawable.ycombinator);
		}
		else if (img_str.toString().equalsIgnoreCase("goldieblox")){
			story_img.setImageResource(R.drawable.goldieblox);
		}
		else if (img_str.toString().equalsIgnoreCase("twitterceo")){
			story_img.setImageResource(R.drawable.twitterceo);
		}
		else if (img_str.toString().equalsIgnoreCase("ceopic")){
			story_img.setImageResource(R.drawable.ceopic);
		}
		else if (img_str.toString().equalsIgnoreCase("h20")){
			story_img.setImageResource(R.drawable.h20);
		}
		else if (img_str.toString().equalsIgnoreCase("collegenew")){
			story_img.setImageResource(R.drawable.collegenew);
		}
		else if (img_str.toString().equalsIgnoreCase("twitter")){
			story_img.setImageResource(R.drawable.twitter);
		}
		else if (img_str.toString().equalsIgnoreCase("linkedin")){
			story_img.setImageResource(R.drawable.linkedin);
		}
		else if (img_str.toString().equalsIgnoreCase("teachgirltocode")){
			story_img.setImageResource(R.drawable.teachgirltocode);
		}
		else{
			story_img.setImageResource(R.drawable.developher);

		}

	}




}
