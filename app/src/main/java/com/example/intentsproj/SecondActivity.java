package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button btnAdd,btnSub,btnMult,btnDiv;
    private TextView number1,number2,numAnswer;
    private double preNum1,preNum2,answer;
    private String num1,num2,ansResult,ansDisplay;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);

        numAnswer=findViewById(R.id.display);

        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMult=findViewById(R.id.btnMult);
        btnDiv=findViewById(R.id.btnDiv);

        Intent intent=getIntent();
        num1=intent.getStringExtra("number1");
        num2=intent.getStringExtra("number2");
        preNum1=intent.getDoubleExtra("number1",0);
        preNum2=intent.getDoubleExtra("number2",0);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answer=preNum1+preNum2;
                ansResult=Double.toString(answer);
                ansDisplay = num1 + "+" + num2 + "="+ansResult;

                numAnswer.setText(ansDisplay);

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answer=preNum1-preNum2;
                ansResult=Double.toString(answer);
                ansDisplay = num1 + "-" + num2 + "="+ansResult;

                numAnswer.setText(ansDisplay);

            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answer=preNum1*preNum2;
                ansResult=Double.toString(answer);
                ansDisplay = num1 + "*" + num2 + "="+ansResult;

                numAnswer.setText(ansDisplay);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answer=preNum1/preNum2;
                ansResult=Double.toString(answer);
                ansDisplay = num1 + "/" + num2 + "="+ansResult;

                numAnswer.setText(ansDisplay);

            }
        });

        //numAnswer.setText(ansDisplay);
    }
    @Override
    public void onResume() {
        super.onResume();

        num1 = Double.toString(preNum1);
        num2 = Double.toString(preNum2);

        number1.setText(num1);
        number2.setText(num2);


    }

}