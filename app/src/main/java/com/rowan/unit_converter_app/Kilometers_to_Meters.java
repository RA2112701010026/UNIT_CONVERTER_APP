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

public class Kilometers_to_Meters extends AppCompatActivity {

EditText values;
TextView result;
Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kilometers_to_meters);

        values=findViewById(R.id.values);
        result=findViewById(R.id.result);
        convert=findViewById(R.id.convert);




        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
       double  y=    Integer.parseInt(values.getText().toString());
    double   x=y*1000;
    result.setText(String.valueOf(x+"Meters"));
            }
        });
    }
}