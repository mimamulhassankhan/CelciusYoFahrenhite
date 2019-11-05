package com.example.celcius_to_farenhite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etxt_user_input,etxt_out;
    private Button btn_c,btn_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt_user_input = (EditText) findViewById(R.id.etxt_input);
        btn_c = (Button) findViewById(R.id.btn_ctof);
        btn_f = (Button) findViewById(R.id.btn_ftoc);

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = Double.parseDouble(etxt_user_input.getText().toString());
                Double res = input*(9.0/5.0)+32.0;
                Toast.makeText(getApplicationContext(),Double.toString(res),Toast.LENGTH_LONG).show();
            }
        });

        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input = Double.parseDouble(etxt_user_input.getText().toString());
                Double res = ((input-32.0)*5.0)/9.0;
                Toast.makeText(getApplicationContext(),Double.toString(res), Toast.LENGTH_LONG).show();
            }
        });
    }
}
