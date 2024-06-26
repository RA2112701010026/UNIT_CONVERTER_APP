package com.rowan.unit_converter_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
TextView title;
Button GK,KG,MK,KM,CI,IC,CF,FC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        KG=findViewById(R.id.KG);
//        MK=findViewById(R.id.MK);
//        GK=findViewById(R.id.GK);
        CI=findViewById(R.id.CI);
        KM=findViewById(R.id.KM);
//        IC=findViewById(R.id.IC);
        CF=findViewById(R.id.CF);
//        FC=findViewById(R.id.FC);
        //intent sections
        Intent kg;
        Intent Inches;
        Intent meters;
        Intent celsius;
        meters=new Intent(MainActivity.this,Kilometers_to_Meters.class);
        Inches=new Intent(MainActivity.this,CentimentersToInches.class);
        kg =new Intent(MainActivity.this,kg_Activity.class);
        celsius=new Intent(MainActivity.this, Celsius_to_Fahrenheit.class);
//
        KG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               startActivity(kg);
            }
        });
        CI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Inches);
            }
        });
        KM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(meters);
            }
        });

        CF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(celsius);
            }
        });
    }
}