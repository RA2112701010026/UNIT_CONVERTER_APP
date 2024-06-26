package com.rowan.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Celsius_to_Fahrenheit extends AppCompatActivity {
EditText values;
Button convert;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_celsius_to_fahrenheit);


        values=findViewById(R.id.values);
        convert=findViewById(R.id.convert);
        result=findViewById(R.id.result);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              double y= Integer.parseInt( values.getText().toString()) ;
              double x=(y*1.8)+32;
              result.setText(String.valueOf(x+"Fahernheit"));
            }
        });


    }
}