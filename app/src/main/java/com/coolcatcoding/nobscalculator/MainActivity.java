package com.coolcatcoding.nobscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Float.*;

public class MainActivity extends AppCompatActivity {

    private static int action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText part1 = (EditText) findViewById(R.id.part1);
                EditText part2 = (EditText) findViewById(R.id.part2);
                TextView result = (TextView) findViewById(R.id.result);

                try {
                    float num1 = parseFloat(part1.getText().toString());
                    float num2 = parseFloat(part2.getText().toString());
                    float r;
                    switch(action) {
                        case 0: r = (num1+num2); break;
                        case 1: r = (num1-num2); break;
                        case 2: r = (num1*num2); break;
                        case 3: r = (num1/num2); break;
                        default: r = 0;
                    }
                    result.setText(""+r);
                } catch(Exception e) {
                    result.setText("Error. You broke it. This is your fault.");
                }
            }
        });
        Spinner actionSpinner = (Spinner) findViewById(R.id.actionSpinner);
        actionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                action = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
