package com.coolcatcoding.nobscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

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
                    int num1 = Integer.parseInt(part1.getText().toString());
                    int num2 = Integer.parseInt(part2.getText().toString());
                    result.setText(""+(num1+num2));
                } catch(Exception e) {
                    result.setText("Error. You broke it. This is your fault.");
                }
            }
        });
    }
}
