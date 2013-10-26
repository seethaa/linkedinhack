package com.example.linkedinhack;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class QuestionsActivity extends Activity {

	private static LinearLayout mainlayout;
	private ImageView jobbutton;
	private ImageView techbutton;
	ImageView malebutton ;
	ImageView femalebutton ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//		setContentView(R.layout.job_function_q);

		setContentView(R.layout.main_vert_lin_layout);

		mainlayout = (LinearLayout) findViewById(R.id.mainLayout);

		RelativeLayout jobfunc = (RelativeLayout) View.inflate(this,
				R.layout.job_function_q, null);

		mainlayout.addView(jobfunc);
		
		RelativeLayout gender = (RelativeLayout) View.inflate(this,
				R.layout.gender, null);
		mainlayout.addView(gender);

		RelativeLayout foi = (RelativeLayout) View.inflate(this,
				R.layout.field_interest, null);
		mainlayout.addView(foi);


		RelativeLayout related = (RelativeLayout) View.inflate(this,
				R.layout.related_ppl, null);
		mainlayout.addView(related);


 
		jobbutton = (ImageView) jobfunc.findViewById(R.id.bizimg);
		jobbutton.setClickable(true);
		jobbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Toast.makeText(QuestionsActivity.this,
						"biz is clicked!", Toast.LENGTH_SHORT).show();
				//
				//				Intent intent = new Intent(QuestionsActivity.this, StatusQ.class);
				//				startActivity(intent);
			}

		});

		techbutton = (ImageView) jobfunc.findViewById(R.id.techimg);

		techbutton.setClickable(true);
		techbutton.setBackgroundResource(R.drawable.tech_selector);
		techbutton.setOnClickListener(new OnClickListener() {

			@Override 
			public void onClick(View arg0) {
				
				techbutton.setBackgroundResource(R.drawable.techchoose);

//				Toast.makeText(QuestionsActivity.this,
//						"tech is clicked!", Toast.LENGTH_SHORT).show();
				//
				//				Intent intent = new Intent(QuestionsActivity.this, StatusQ.class);
				//				startActivity(intent);

			}

		}); 


		malebutton = (ImageView) gender.findViewById(R.id.menimg);
		malebutton.setClickable(true);
		malebutton.setBackgroundResource(R.drawable.men_selector);
		
		malebutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Drawable d = getResources().getDrawable(R.drawable.menchoose);
//				malebutton.setBackgroundResource(R.drawable.menchoose);
				
				
//				malebutton.setVisibility(View.INVISIBLE);
//				malebutton.setBackgroundDrawable(getResources().getDrawable(R.drawable.menchoose));
//				malebutton.setVisibility(View.VISIBLE);

//				 buttonName.setBackgroundDrawable
//		         (getResources().getDrawable(R.drawable.imageName_selected));
			} 

		});


		femalebutton = (ImageView) gender.findViewById(R.id.womenimg);
		femalebutton.setClickable(true);
		femalebutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				femalebutton.setBackgroundResource(R.drawable.female);

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
