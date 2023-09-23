package com.cs407.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num1, num2;
    TextView textView;


    public void add(View view) {
        EditText e1 = (EditText) findViewById(R.id.num1);
        EditText e2 = (EditText) findViewById(R.id.num2);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        int res = num1 + num2;
        goToActivity(res);
    }

    public void subtract(View view) {
        EditText e1 = (EditText) findViewById(R.id.num1);
        EditText e2 = (EditText) findViewById(R.id.num2);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        int res = num1 - num2;
        goToActivity(res);
    }

    public void multiply(View view) {
        EditText e1 = (EditText) findViewById(R.id.num1);
        EditText e2 = (EditText) findViewById(R.id.num2);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        int res = num1 * num2;
        goToActivity(res);
    }

    public void divide(View view) {
        EditText e1 = (EditText) findViewById(R.id.num1);
        EditText e2 = (EditText) findViewById(R.id.num2);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s2);
        if (num2 == 0) {
            Intent intent = new Intent(this, CalculatorActivity.class);
            intent.putExtra("message", "Error: Divide by 0");
            startActivity(intent);
        }
        int res = num1 / num2;
        goToActivity(res);
    }

    public void goToActivity(int n) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("message", Integer.toString(n));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}