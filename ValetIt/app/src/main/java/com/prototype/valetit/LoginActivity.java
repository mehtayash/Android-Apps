package com.prototype.valetit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ymehta on 07/03/15.
 */
public class LoginActivity extends Activity {

    Button loginButton;
    TextView signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        loginButton = (Button)findViewById(R.id.but_main_login);
        signUp = (TextView)findViewById(R.id.but_main_signup);
        loginButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent valetActivity = new Intent(LoginActivity.this, ValetActivity.class);
                startActivity(valetActivity);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent signupActivity = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(signupActivity);
            }
        });
    }
}
