package com.rht6226.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button convertBtn;
    Button clearBtn;
    TextView output;
    EditText meterVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        meterVal = findViewById(R.id.metreVal);

        convertBtn = findViewById(R.id.converter);
        convertBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s;
                        if(meterVal.getText().toString().equals("")){
                            s = "Please enter a value!!";
                            output.setText(s);
                            output.setTextSize(34);
                            output.setTextColor(Color.RED);
                        }
                        else {
                            float val = Float.parseFloat(meterVal.getText().toString());
                            float inches = (float) (val * 39.3701);
                            s = String.valueOf(val) + " metres = " + String.valueOf(inches) + " inches !!";
                            output.setText(s);
                        }
                    }
                }
        );

        clearBtn = findViewById(R.id.clear_button);
        clearBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        output.setText("");
                    }
                }
        );


    }
}
