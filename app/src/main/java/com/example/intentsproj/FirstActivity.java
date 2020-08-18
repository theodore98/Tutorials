package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private Button button;
    private EditText number1;
    private EditText number2;
    private double num1Sent,num2Sent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        button=(Button)findViewById(R.id.btnOK);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
                 
            }
        });

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


    }
    public void openSecondActivity(){
        Intent intent=new Intent(this,SecondActivity.class);

        num1Sent = Double.valueOf(number1.getText().toString());
        num2Sent = Double.valueOf (number2.getText().toString());
        intent.putExtra("number1",num1Sent);
        intent.putExtra("number2",num2Sent);

        startActivity(intent);

    }
}