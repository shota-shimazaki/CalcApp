package com.example.shimazakishota.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        double sum = intent.getDoubleExtra("sum", 0.0);



        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(sum));
    }
        }
