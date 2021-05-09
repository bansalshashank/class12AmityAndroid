package com.amity.april112021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListViewMay023 extends AppCompatActivity {

    String[] data = { "Abhinav", "Divyansh", "Nitay", "Stuti"};
    String[] data2 = {"Data Point 1", "Data Point 2", "Data Point 2", "Data Point 3"};
    ArrayList list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_may02);

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this,
                R.layout.list_view,
                list
        );

        ArrayAdapter adapter2 = new ArrayAdapter<String>(
                this, R
                .layout.list_view,
                data2);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        Configuration configuration = getResources().getConfiguration();
        Button  button = findViewById(R.id.submitField);
        EditText field = findViewById(R.id.addField);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(field.getText().toString());
                listView.setAdapter(adapter);
            }
        });

        if( configuration.orientation == Configuration.ORIENTATION_LANDSCAPE ) {
            ListView listView2 = findViewById(R.id.listView2);
            listView2.setAdapter(adapter2);
        }
    }
}