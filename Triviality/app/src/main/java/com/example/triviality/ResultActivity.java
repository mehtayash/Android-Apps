package com.example.triviality;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.MenuItem;
import android.content.Intent;
public class ResultActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_results);

        getActionBar().setHomeButtonEnabled(true);

        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");
        // Font path
        String fontPath = "fonts/xmasxpress.ttf";

        // text view label
        TextView txtScore = (TextView) findViewById(R.id.text_score);
        TextView txtResult = (TextView) findViewById(R.id.text_final_result);
        ImageView imgFinal = (ImageView) findViewById(R.id.img_result);

        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        //txtScore.setTypeface(tf);

		txtScore.setText(score + "/10");

        if (score > 5 ) {
            txtResult.setText("You Win");
            imgFinal.setImageResource(R.drawable.winner);
        } else {
            txtResult.setText("Better Luck Next Time");
            imgFinal.setImageResource(R.drawable.luck);
        }
	}

    /**
     * Let's the user tap the activity icon to go 'home'.
     * Requires setHomeButtonEnabled() in onCreate().
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                // ProjectsActivity is my 'home' activity
                startActivityAfterCleanup(MainActivity.class);
                return true;
        }
        return (super.onOptionsItemSelected(menuItem));
    }

    private void startActivityAfterCleanup(Class<?> cls) {
        Intent intent = new Intent(getApplicationContext(), cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}

    public void goHome(MenuItem item){
        startActivityAfterCleanup(MainActivity.class);
    }
}
