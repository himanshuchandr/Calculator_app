package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Addition(View v)
    {
        EditText editText =(EditText)findViewById(R.id.editTextNumber);
        EditText editText2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText editText3 =(EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int res = n1 + n2;
        editText3.setText("Total Value "+ res);
    }
    public void Subtraction(View v) {
        EditText editText =(EditText)findViewById(R.id.editTextNumber);
        EditText editText2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText editText3 =(EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int res = n1 - n2;

        editText3.setText("Subtract Value " + res);
    }
    public void Multi(View v) {
        EditText editText =(EditText)findViewById(R.id.editTextNumber);
        EditText editText2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText editText3 =(EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int res = n1 * n2;

        editText3.setText("Multiply Value " + res);
    }
    public void Division(View v) {
        EditText editText =(EditText)findViewById(R.id.editTextNumber);
        EditText editText2 =(EditText)findViewById(R.id.editTextNumber2);
        EditText editText3 =(EditText)findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(editText.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int res = n1 / n2;

        editText3.setText("Division Value " + res);
    }
}