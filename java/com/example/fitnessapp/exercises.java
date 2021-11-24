package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class exercises extends AppCompatActivity {
    ImageView beginner,intermediate,advanced;
    Animation bttone;
    TextView one,two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        //init elements
        beginner =findViewById( R.id.d1);
        intermediate = findViewById( R.id.d2);
        advanced = findViewById(R.id.d3);
        bttone= AnimationUtils.loadAnimation(this,R.anim.bttone);
        one=findViewById(R.id.textView7);
        two=findViewById(R.id.textView9);

        //add anim
        beginner.setAnimation(bttone);
        intermediate.setAnimation(bttone);
        advanced.setAnimation(bttone);
        one.setAnimation(bttone);
        two.setAnimation(bttone);


        //Onclick
        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(exercises.this,basicexe.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(exercises.this,interexe.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(exercises.this,advexe.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}
