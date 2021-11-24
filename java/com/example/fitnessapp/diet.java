package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class diet extends AppCompatActivity {
    Animation bttone;
    TextView tv1,tv2;
    ImageView v1,v2,v3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        //init elements
        bttone= AnimationUtils.loadAnimation(this,R.anim.bttone);
        tv1=findViewById(R.id.textView7);
        tv2=findViewById(R.id.textView9);
        v1=findViewById(R.id.d1);
        v2=findViewById(R.id.d2);
        v3=findViewById(R.id.d3);


        //adding anim
        tv1.setAnimation(bttone);
        tv2.setAnimation(bttone);
        v1.setAnimation(bttone);
        v2.setAnimation(bttone);
        v3.setAnimation(bttone);

        //OnclickListeners
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=1;
                Intent myIntent = new Intent(diet.this, recipe.class);
                myIntent.putExtra("intVariableName", val);
                startActivity(myIntent);
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=2;
                Intent myIntent = new Intent(diet.this, recipe.class);
                myIntent.putExtra("intVariableName", val);
                startActivity(myIntent);
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=3;
                Intent myIntent = new Intent(diet.this, recipe.class);
                myIntent.putExtra("intVariableName", val);
                startActivity(myIntent);
            }
        });

    }
}
