package com.example.shimazakishota.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mEditText1;
    EditText mEditText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
    }


    @Override
    public void onClick(View v) {
        double sum = 0.0;
        String str1 = mEditText1.getText().toString();
        String str2 = mEditText2.getText().toString();

        if (str2.equals("")) {
            return;
            new View.OnClickListener() {
                public void onClick(View view) {
                    Snackbar.make(view, "数字を入力してください", Snackbar.LENGTH_INDEFINITE)
                            .setAction("Action", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Log.d("UI-PARTS", "Snackbarをタップした");
                                }
                            }).show();
                }
            };
        }

        double value1 =Double.parseDouble(str1);
        double value2= Double.parseDouble(str2);

        switch (v.getId()) {
            case R.id.button1:
                sum = value1 + value2;
                break;

            case R.id.button2:
                sum =  value1- value2;
                break;

            case R.id.button3:
                sum = value1 * value2;
                break;
            case R.id.button4:
                sum =  value1 / value2;
                break;
        }

            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("sum",sum);
            startActivity(intent);

        }
    }
