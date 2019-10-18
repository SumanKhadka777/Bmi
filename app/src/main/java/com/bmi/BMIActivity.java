package com.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    TextView tvmyans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);


            Bundle bundle=getIntent().getExtras();
            float stuff=Float.parseFloat(bundle.getString("report"));

            tvmyans=findViewById(R.id.tvreport);
            //tvmyans.setText("You EMI is: "+stuff);
            if (stuff<=16)
            {
                tvmyans.setText("Severe thiness");
            }
            else if(stuff>16 && stuff<=17)
            {
                tvmyans.setText("Moderate thiness");
            }
            else if(stuff>17 && stuff<=18.5)
            {
                tvmyans.setText("Mild thiness");
            }
            else if(stuff>18.5 && stuff<=25)
            {
                tvmyans.setText("Normal");
            }
            else if(stuff>25 && stuff<=30)
            {
                tvmyans.setText("Overweight");
            }
            else if(stuff>30)
            {
                tvmyans.setText("Obese class");
            }

        }
    }


