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

public class kg_Activity extends AppCompatActivity {
TextView result;
Button btnKg;
EditText weightKg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kg);

        result=findViewById(R.id.result);
        btnKg=findViewById(R.id.btnKg);
        weightKg=findViewById(R.id.weightKg);


       btnKg.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int kgs=  Integer.parseInt(weightKg.getText().toString());
                int results=kgs*1000;
                result.setText(String.valueOf(results+" grams"));

           }
       });
    }
}