package com.e.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText etHeight, etWeight;
    Button btnCalc;
    TextView tvBMI;
    EditText etBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        btnCalc = findViewById(R.id.btnCalc);
        tvBMI = findViewById(R.id.tvBMI);
        etBMI= findViewById(R.id.etBMI);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etHeight.getText().toString())) {
                    etHeight.setError("Please Enter your height");
                    return;
                }
                if (TextUtils.isEmpty(etWeight.getText().toString())) {
                    etWeight.setError("Please Enter your weight");
                    return;
                }

                double etHeight1, etWeight2;
                etHeight1 = Double.parseDouble(etHeight.getText().toString());
                etWeight2 = Double.parseDouble(etWeight.getText().toString());
                Nabin_BMI Result = new Nabin_BMI(etHeight1, etWeight2);
                double myBMI = Result.calcBMI();
                etBMI.setText(Double.toString(myBMI));
            }
        });
    }




}
