package com.prototype.valetit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ymehta on 07/03/15.
 */
public class CarActivity extends ActionBarActivity {

    Button proceedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_layout);

        proceedButton = (Button)findViewById(R.id.but_proceed);

        proceedButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent valetActivity = new Intent(CarActivity.this, ValetActivity.class);
                startActivity(valetActivity);
            }
        });
    }
}
