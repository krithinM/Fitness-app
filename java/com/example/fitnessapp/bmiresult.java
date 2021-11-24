package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class bmiresult extends AppCompatActivity {
    TextView t,comment,t1,t2,t3;
    ConstraintLayout layout;
    ImageView i1,i2,i3,img;
    ArrayList<String> tips1,tips2,tips3;
    String com,color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiresult);

        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        float bmi = bundle.getFloat("BMI");

        // init elements
        t = findViewById(R.id.result1);
        layout=findViewById(R.id.layout1);
        comment=findViewById(R.id.comment);
        t1=findViewById(R.id.r2);
        t2=findViewById(R.id.r3);
        t3=findViewById(R.id.r4);
        i1=findViewById(R.id.i2);
        i2=findViewById(R.id.i3);
        i3=findViewById(R.id.i4);
        img=findViewById(R.id.img);


        //Tips String
        tips1 = new ArrayList<>();
        tips1.add("Introduce dry fruits and dairy products into your diet");
        tips1.add("Have at least 7 hours of sleep everyday");
        tips1.add("Increase the protein content in your diet");

        tips2 = new ArrayList<>();
        tips2.add("Keep track of your weight regularly");
        tips2.add("Have a balanced diet");
        tips2.add("Have appropriate sleep and rest");

        tips3 = new ArrayList<>();
        tips3.add("Exercise regularly to burn calories and improve metabolism");
        tips3.add("Avoid sugary drinks and fruit juice");
        tips3.add("Reduce carbohydrates in your diet");



        String s = "Your BMI is =" + " "+ String.format("%.2f", bmi);
        t.setText(s);


        //Result handling
        if(bmi<18.5){
            layout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            img.setImageResource(R.drawable.em);
            com="Your are underweight";
            comment.setText(com);
            i1.setImageResource(R.drawable.wg1);
            t1.setText(tips1.get(0));
            i2.setImageResource(R.drawable.wg2);
            t2.setText(tips1.get(1));
            i3.setImageResource(R.drawable.wg3);
            t3.setText(tips1.get(2));
        }
        else if (bmi >18.5 &&  bmi<25){
            layout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            img.setImageResource(R.drawable.correct);
            com="Your weight is ideal";
            comment.setText(com);
            i1.setImageResource(R.drawable.wn1);
            t1.setText(tips2.get(0));
            i2.setImageResource(R.drawable.wn2);
            t2.setText(tips2.get(1));
            i3.setImageResource(R.drawable.wg2);
            t3.setText(tips2.get(2));

        }
        else{
            layout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            img.setImageResource(R.drawable.warning);
            com="Your are overweight";
            comment.setText(com);
            i1.setImageResource(R.drawable.wl1);
            t1.setText(tips2.get(0));
            i2.setImageResource(R.drawable.wl2);
            t2.setText(tips2.get(1));
            i3.setImageResource(R.drawable.wl3);
            t3.setText(tips2.get(2));
        }



    }

}
