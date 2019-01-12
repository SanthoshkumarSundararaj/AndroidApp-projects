package com.example.karthik.myapplication_choco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class display extends AppCompatActivity {

    ArrayList<String> name = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent i = getIntent();
        name = i.getStringArrayListExtra("token");
        TextView textView = (TextView) findViewById(R.id.textView23);
        Toast.makeText(this, "Order Placed " + name, Toast.LENGTH_LONG).show();
        
    }
}
