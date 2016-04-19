package com.example.triviality;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ymehta on 27/12/14.
 */
public class FormActivity extends Activity {

    EditText name,number,designation,company, aadhar, models, address;
    Button butProceed;
    int score;
    FileWriter writer;

    File root;
    File gpxfile ;

    String ip_name,ip_address,ip_company,ip_designation,ip_aadhar,ip_model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Bundle b = getIntent().getExtras();
        score= b.getInt("score");

        name = (EditText)findViewById(R.id.input_name);
        address = (EditText)findViewById(R.id.input_address);
        designation = (EditText)findViewById(R.id.input_designation);
        company = (EditText)findViewById(R.id.input_company);


        butProceed = (Button)findViewById(R.id.but_proceed);

        root = Environment.getExternalStorageDirectory();
        gpxfile = new File(root, "companydata.csv");
        if (!gpxfile.exists()) {
            try {
                writer = new FileWriter(gpxfile, true);
                writeCsvHeader("Name","Address","Company","Designation");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        butProceed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ip_name = name.getText().toString();
                ip_address = address.getText().toString();
                ip_company = company.getText().toString();
                ip_designation = designation.getText().toString();

                if(ip_name.matches("") || ip_company.matches("")) {
                    createAlertDialog().show();
                } else {
                    try {
                        writer = new FileWriter(gpxfile, true);
                        writeCsvData(ip_name,ip_address,ip_company,ip_designation);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Intent intent = new Intent(FormActivity.this, ResultActivity.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); //Your score
                    intent.putExtras(b); //Put your score to your next Intent
                    startActivity(intent);
                    finish();
                }
            }

        });
    }

    private void writeCsvHeader(String h1, String h2, String h3, String h4) throws IOException {
        String line = String.format("%s,%s,%s,%s\n", h1,h2,h3,h4);
        writer.write(line);
        writer.flush();
        writer.close();
    }

    private void writeCsvData(String h1, String h2, String h3, String h4) throws IOException {
        String line = String.format("%s,%s,%s,%s\n", h1,h2,h3,h4);
        writer.write(line);
        writer.flush();
        writer.close();
    }

    private Dialog createAlertDialog() {
        return new AlertDialog.Builder(this).setTitle("Alert")
                .setMessage("Fill in the required fields *").create();
    }
}
