package com.vsga.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private int input1;
    private int input2;
    private EditText editInput1;
    private EditText editInput2;
    private TextView hasilText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editInput1=findViewById(R.id.editTextInput1);
        editInput2=findViewById(R.id.editTextInput2);
        hasilText=findViewById(R.id.textHasil);
        Intent intent=getIntent();
        if(intent.hasExtra("COUNT")){
            input1=intent.getIntExtra("COUNT",0);
            editInput1.setText(input1+"");
        }
    }

    public void sumUp(View view) {
        input1=Integer.parseInt(editInput1.getText().toString());
        input2=Integer.parseInt(editInput2.getText().toString());
        int jumlah=input1+input2;
        hasilText.setText(jumlah+"");

    }
}