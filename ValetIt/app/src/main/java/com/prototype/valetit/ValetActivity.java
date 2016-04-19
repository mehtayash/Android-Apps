package com.prototype.valetit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ymehta on 07/03/15.
 */
public class ValetActivity extends ActionBarActivity {

    Button getCarButton;
    Spinner spinHotel,spinCar, spinTime;
    StringBuffer smsMessage, options;
    CheckBox check1,check2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valet_layout);

        getCarButton = (Button)findViewById(R.id.but_get_car);
        check1 = (CheckBox)findViewById(R.id.check_ac);
        check2 = (CheckBox)findViewById(R.id.check_window);

        getCarButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Getting your Car",
                        Toast.LENGTH_LONG).show();
                Intent smsIntent = new Intent(Intent.ACTION_VIEW);

                if(check1.isChecked()){

                    options = new StringBuffer("Switch on the AC.");
                }
                if (check2.isChecked()){
                    options.append( "Pull down the windows.");
                }
                if(options!=null){
                    smsMessage = new StringBuffer("Get Car " + spinCar.getSelectedItem().toString()+ ". "+ options);
                }

                String phoneNo = "9731453007";
                String sms = smsMessage.toString();

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null, sms, null, null);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "SMS failed, please try again later!",
                            Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }

            }
        });

        spinHotel = (Spinner) findViewById(R.id.spin_hotel);
        List<String> list1 = new ArrayList<String>();
        list1.add("Ritz Carlton");
        list1.add("Taj Vivanta");
        list1.add("Leela Palace");
        list1.add("Taj West End");
        list1.add("Sheraton");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>
                (this, R.layout.row_layout,R.id.list_item, list1);


        spinHotel.setAdapter(dataAdapter1);

        spinCar = (Spinner) findViewById(R.id.spin_car);
        List<String> list2 = new ArrayList<String>();
        list2.add("Swift KA 12 M 2315");
        list2.add("Benz KA 03 K 6666");
        list2.add("BMW KA 02 P 2444");
        list2.add("Polo MH 09 H 9998");

        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>
                (this, R.layout.row_layout,R.id.list_item,list2);

        spinCar.setAdapter(dataAdapter2);

        spinTime = (Spinner) findViewById(R.id.spin_time);
        List<String> list3 = new ArrayList<String>();
        list3.add("5 mins");
        list3.add("10 mins");
        list3.add("15 mins");
        list3.add("20 mins");


        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>
                (this, R.layout.row_layout,R.id.list_item,list3);

        spinTime.setAdapter(dataAdapter3);


    }

}

