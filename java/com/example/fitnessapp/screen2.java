package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class screen2 extends AppCompatActivity {
    ImageButton bmi,exe,diet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        //init elements
        bmi=findViewById(R.id.imageButton1);
        exe=findViewById(R.id.female);
        diet=findViewById(R.id.imageButton3);

        //OnclickListeners
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(screen2.this,bmi.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
        exe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(screen2.this,exercises.class);
                b.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(b);

            }
        });
        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(screen2.this,diet.class);
                c.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(c);
            }
        });


    }
}
