package com.amity.april112021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class April25 extends AppCompatActivity {

    final String TAG = "april25";

    EditText firstName, lastName, dob;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_april25);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        dob = findViewById(R.id.dob);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = firstName.getText().toString();
                String lname = lastName.getText().toString();
                String db = dob.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);

                intent.putExtra("firstName", fname);
                intent.putExtra("lastName", lname);
                intent.putExtra("dob", db);

                startActivity(intent);


            }
        });

    }
}