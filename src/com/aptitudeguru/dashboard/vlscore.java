package com.aptitudeguru.dashboard;





import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidhive.dashboard.R;

public class vlscore extends Activity {

	int y1[];
	TextView t1, t2, t3, t4;
	DatabaseHandler db = new DatabaseHandler(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.verbal);

		Button btn_home = (Button) findViewById(R.id.btn_home);

	
		Button btn_fav = (Button) findViewById(R.id.btn_fav);

		
		Button btn_score = (Button) findViewById(R.id.btn_score);

		
		Button btn_tutorial = (Button) findViewById(R.id.btn_soundon);
Button btn_help = (Button) findViewById(R.id.btn_help);
		
		btn_help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
					Help.class);

				startActivity(i);
			}
		});

		
		Button btn_about = (Button) findViewById(R.id.btn_about);

		
		btn_home.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
						AndroidDashboardDesignActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		
		btn_fav.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			
				Intent i = new Intent(getApplicationContext(), FavPage.class);

				startActivity(i);
			}
		});

	
		btn_score.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			
				Intent i = new Intent(getApplicationContext(), scoremenu.class);
				startActivity(i);
			}
		});

	
		btn_tutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
						Tutorialpage.class);
				startActivity(i);
			}
		});

		
		btn_about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), AboutUs.class);
				startActivity(i);
			}
		});

		Button btn_v1 = (Button) findViewById(R.id.btn_v1);

	
		btn_v1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "v1";
				
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);

				startActivity(i);

			}
		});

		
		Button btn_v2 = (Button) findViewById(R.id.btn_v2);

		
		btn_v2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			
				String cat = "v2";

				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);

				startActivity(i);
			}
		});

		Button btn_v3 = (Button) findViewById(R.id.btn_v3);

		 
		btn_v3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "v3";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});
		
		Button btn_v4 = (Button) findViewById(R.id.btn_v4);

		 
		btn_v4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "v4";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

	 
		Button btn_v5 = (Button) findViewById(R.id.btn_v5);

		 
		btn_v5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "v5";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

	 
		Button btn_v6 = (Button) findViewById(R.id.btn_v6);

		 
		btn_v6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "v6";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});

	 
		Button btn_v7 = (Button) findViewById(R.id.btn_v7);

		 
		btn_v7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "v7";
				Intent i = new Intent(getApplicationContext(), TestScore.class);
				i.putExtra("cat", cat);
				startActivity(i);
			}
		});
	}
}
