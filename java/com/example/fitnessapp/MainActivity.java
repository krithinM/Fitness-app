package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int selector;
    TextView quote,quote2,start;
    ArrayList<String> listOfRandomQuotes;
    Animation alphagogo,animimgpage,btteight,bttfive,bttfour,btthree,bttone,bttseven,bttsix,bttwo,ltr,ttbone,ttbtwo;
    ImageView img;
    View abar1,abar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* List of Random Quotes */

        listOfRandomQuotes = new ArrayList<String>();
        listOfRandomQuotes.add("All progress takes place outside the comfort zone");
        listOfRandomQuotes.add("The only place where success comes before work is in the dictionary");
        listOfRandomQuotes.add("Whether you think you can, or you think you can’t, you’re right");
        listOfRandomQuotes.add("Action is the foundational key to all success");
        listOfRandomQuotes.add("Things may come to those who wait, but only the things left by those who hustle");
        listOfRandomQuotes.add("Well done is better than well said");
        listOfRandomQuotes.add("What hurts today makes you stronger tomorrow");
        listOfRandomQuotes.add("If something stands between you and your success, move it. Never be denied");
        listOfRandomQuotes.add("You have to think it before you can do it. The mind is what makes it all possible");
        listOfRandomQuotes.add("Things work out best for those who make the best of how things work out");

        /* Init Animations  */

        alphagogo=AnimationUtils.loadAnimation(this,R.anim.alphagogo);
        animimgpage=AnimationUtils.loadAnimation(this,R.anim.animimgpage);
        btteight=AnimationUtils.loadAnimation(this,R.anim.btteight);
        bttfive=AnimationUtils.loadAnimation(this,R.anim.bttfive);
        bttfour=AnimationUtils.loadAnimation(this,R.anim.bttfour);
        btthree=AnimationUtils.loadAnimation(this,R.anim.btthree);
        bttone=AnimationUtils.loadAnimation(this,R.anim.bttone);
        bttseven=AnimationUtils.loadAnimation(this,R.anim.bttseven);
        bttsix=AnimationUtils.loadAnimation(this,R.anim.bttsix);
        bttwo=AnimationUtils.loadAnimation(this,R.anim.bttwo);
        ltr=AnimationUtils.loadAnimation(this,R.anim.ltr);
        ttbone=AnimationUtils.loadAnimation(this,R.anim.ttbone);
        ttbtwo=AnimationUtils.loadAnimation(this,R.anim.ttbtwo);


        /* Init Elements  */

        img=findViewById(R.id.img);
        quote=findViewById(R.id.quote);
        quote2=findViewById(R.id.tv2);
        start=findViewById(R.id.textView);
        abar1=findViewById(R.id.abar1);
        abar2=findViewById(R.id.beginnerbar);


        /* Fetching Random Quote  */

        Random randomNumber = new Random();
        selector = randomNumber.nextInt(9);
        quote.setText(listOfRandomQuotes.get(selector));

        //setting animations

        img.setAnimation(animimgpage);
        quote.setAnimation(bttone);
        quote2.setAnimation(bttone);
        start.setAnimation(btthree);
        abar1.setAnimation(bttwo);
        abar2.setAnimation(ltr);

        //OnClick listener to move to second screen

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,screen2.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }
}
