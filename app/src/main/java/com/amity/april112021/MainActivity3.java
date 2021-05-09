package com.amity.april112021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "MainActivity3";

    Button incButton, decButton;
    TextView counter;

    int number;
    String updatedNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        incButton = findViewById(R.id.button5);
        decButton = findViewById(R.id.button4);
        counter = findViewById(R.id.textView3);
        number = 0;

        incButton.setOnClickListener(this);
        decButton.setOnClickListener(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Log.e(TAG, "First Name " + bundle.getString("firstName"));
        Log.e(TAG, "Last Name " + bundle.getString("lastName"));
        Log.e(TAG, "DOB " + bundle.getString("dob"));


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5:
                number++;
                updatedNumber = number + "";
                counter.setText(updatedNumber);
                break;
            case R.id.button4:
                number--;
                updatedNumber = number + "";
                counter.setText(updatedNumber);
                break;
        }
    }
}