package com.prototype.valetit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by ymehta on 07/03/15.
 */
public class CoverActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cover_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(CoverActivity.this, LoginActivity.class);
                startActivity(mainIntent);
                CoverActivity.this.finish();
            }
        }, 5000);


    }

}
