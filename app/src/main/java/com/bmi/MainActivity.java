package com.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editHeight , editWeight;
    TextView result;
    Button btnCal;
    float Height , Weight , BMI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editHeight = findViewById(R.id.editHeight);
        editWeight =  findViewById(R.id.editWeight);
        result =  findViewById(R.id.tvresult);
        btnCal= findViewById(R.id.btnCal);
        btnCal.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(editHeight.getText().toString())){

            editHeight.setError("Enter height");
            return;
        }
        else if (TextUtils.isEmpty(editWeight.getText().toString())){

            editWeight.setError("Enter Weight");
            return;
        }

        Height=Float.parseFloat(editHeight.getText().toString());
        Weight=Float.parseFloat(editWeight.getText().toString());
       BMI=(Weight/Height*Height);
       result.setText(BMI+" ");

        Intent intent = new Intent();
        intent = new Intent(MainActivity.this, BMIActivity.class);
        Bundle bundle=new Bundle();
        bundle.putString("report", BMI+"");
        intent.putExtras(bundle);
        startActivity(intent);

        }

    }

