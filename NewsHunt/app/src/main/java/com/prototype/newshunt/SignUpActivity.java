package com.prototype.newshunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by ymehta on 10/05/15.
 */
public class SignUpActivity extends ActionBarActivity {

    EditText name,email,password;
    Spinner age, gender;
    TextView register;

    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        age = (Spinner)findViewById(R.id.spinner_age);
        gender = (Spinner)findViewById(R.id.spinner_gender);

        signUp = (Button)findViewById(R.id.but_signup);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categories = new Intent(SignUpActivity.this, Categories.class);
                startActivity(categories);
            }
        });


    }
}