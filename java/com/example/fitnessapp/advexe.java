package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class advexe extends AppCompatActivity {
    TextView titlepage, subtitlepage, intropage, subintropage,
            btnexercise, fitonetitle, fitonedesc, fittwotitle, fittwodesc,
            fitthreetitle, fitthreedesc, fitfourtitle, fitfourdesc;
    Animation bttone, bttwo, bttfour, bttfive, bttsix, bttseven, btteight;
    View divpage, bgprogress;
    LinearLayout fitone, fittwo, fitthree, fitfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advexe);

        // load animations
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        bttfive = AnimationUtils.loadAnimation(this, R.anim.bttfive);
        bttsix = AnimationUtils.loadAnimation(this, R.anim.bttsix);
        bttseven = AnimationUtils.loadAnimation(this, R.anim.bttseven);
        btteight = AnimationUtils.loadAnimation(this, R.anim.btteight);

        //init elements
        titlepage = findViewById(R.id.title);
        subtitlepage =findViewById(R.id.dec);
        intropage =findViewById(R.id.intropage);
        subintropage = findViewById(R.id.decs1);
        btnexercise =  findViewById(R.id.btnexercise);
        divpage = findViewById(R.id.divpage);
        bgprogress = findViewById(R.id.bgprogress);


        // item fit layout
        fitone =findViewById(R.id.fitone);
        fittwo = findViewById(R.id.fittwo);
        fitthree = findViewById(R.id.fitthree);
        fitfour = findViewById(R.id.fitfour);

        // item fit
        fitonetitle = findViewById(R.id.title);
        fitonedesc = findViewById(R.id.desc);
        fittwotitle = findViewById(R.id.fittwotitle);
        fittwodesc =findViewById(R.id.fittwodesc);
        fitthreetitle = findViewById(R.id.fitthreetitle);
        fitthreedesc = findViewById(R.id.fitthreedesc);
        fitfourtitle = findViewById(R.id.fitfourtitle);
        fitfourdesc = findViewById(R.id.fitfourdesc);


        // assign the animations
        titlepage.startAnimation(bttone);
        subtitlepage.startAnimation(bttone);
        divpage.startAnimation(bttone);
        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);
        fitone.startAnimation(bttwo);
        fittwo.startAnimation(bttfour);
        fitthree.startAnimation(bttfive);
        fitfour.startAnimation(bttsix);
        btnexercise.startAnimation(btteight);
        bgprogress.startAnimation(bttseven);


        // give an event to another page
        btnexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=3;
                Intent myIntent = new Intent(advexe.this, StartWorkAct.class);
                myIntent.putExtra("intVariableName", val);
                startActivity(myIntent);
            }
        });
    }
}
