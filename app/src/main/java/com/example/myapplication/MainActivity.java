package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.TextNumber1);
        et2 = (EditText)findViewById(R.id.TextNumber2);
        tv1 = (TextView) findViewById(R.id.textViewResultado);

    }

    //This method makes sum
    public void Sum (View view) {
        String value1 = et1.getText().toString();
        String value2 = et1.getText().toString();

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value1);

        int sum = num1 + num2;

        String result = String.valueOf(sum);
        tv1.setText(result);
    }
}