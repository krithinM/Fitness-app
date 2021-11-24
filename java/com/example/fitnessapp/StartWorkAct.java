package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class StartWorkAct extends AppCompatActivity {

    ArrayList<String> basic, inter,adv;
    TextView intropage, subintropage, fitonetitle, fitonedesc, timerValue, btnexercise;
    View divpage, bgprogress;
    ImageView imgtimer,img;
    LinearLayout fitone;
    int count1 = 1,count2 =1;
    private static long START_TIME_IN_MILLIS = 300000;
    private CountDownTimer countDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    Animation btthree, bttfour, ttbone, ttbtwo, alphagogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_work);

        Intent mIntent = getIntent();
        final int val = mIntent.getIntExtra("intVariableName", 0);


        // load animations
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        bttfour = AnimationUtils.loadAnimation(this, R.anim.bttfour);
        ttbone = AnimationUtils.loadAnimation(this, R.anim.ttbone);
        ttbtwo = AnimationUtils.loadAnimation(this, R.anim.ttbtwo);
        alphagogo = AnimationUtils.loadAnimation(this, R.anim.alphagogo);

        //init elements
        intropage = findViewById(R.id.intropage);
        subintropage = findViewById(R.id.decs1);
        btnexercise =  findViewById(R.id.btnexercise);
        fitonetitle = findViewById(R.id.title);
        fitonedesc =  findViewById(R.id.desc);
        timerValue = findViewById(R.id.timerValue);
        divpage =  findViewById(R.id.divpage);
        bgprogress = findViewById(R.id.bgprogress);
        fitone =  findViewById(R.id.fitone);
        imgtimer = findViewById(R.id.imgtimer);
        img= findViewById(R.id.img);

        // assign animation
        btnexercise.startAnimation(bttfour);
        bgprogress.startAnimation(btthree);
        fitone.startAnimation(ttbone);
        intropage.startAnimation(ttbtwo);
        subintropage.startAnimation(ttbtwo);
        divpage.startAnimation(ttbtwo);
        timerValue.startAnimation(alphagogo);
        imgtimer.startAnimation(alphagogo);


        basic = new ArrayList<String>();

        basic.add("Initiate the movement by sending the hips back as if you’re sitting back into an invisible chair. Bend knees to lower down as far as possible with chest lifted in a controlled movement. Keep lower back neutral. Press through heels to stand back up to starting position. Repeat.");
        basic.add("Get into a plank position, distributing your weight evenly between your hands and your toes. Pull your right knee into your chest as far as you can, Switch legs, pulling one knee out and bringing the other knee in. Repeat.");
        basic.add("Lie on your back on an mat. Bend your knees so your feet are flat on the floor. Cross your arms in front of your chest. Lift your shoulder blades off of the mat. Lower yourself back down with a slow, steady motion. Repeat. ");
        basic.add("Begin with your chest and stomach flat on the floor and your legs straight out. Exhale as you push from your hands and heels, Pause for a second, lower yourself. Repeat.");

        inter = new ArrayList<String>();

        inter.add("Keeping back straight and knees behind toes, sink hips back and lower into squat until thighs are parallel to ground Extend hips and knees to drive up out of squat position. Repeat.");
        inter.add("Lie flat on your back on a bench. Grip the dumbbell with hands just wider than shoulder-width. Bring the dumbbell slowly as you breathe out. Push up as you breathe out. Repeat.");
        inter.add("Get into a press-up position with a dumbbell in each hand. Raise one of the dumbbells, supporting yourself on the other arm Row the weight upward until your upper arm is slightly higher than your torso, then slowly lower it back down to the ground. Repeat.");
        inter.add("Hold dumbbells in your hands. Step up with the right foot, straightening it. Bring the left foot to meet your right foot on top of the step. Bend your right knee and step down with the left foot. Bring the right foot down. Repeat.");

        bgprogress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(val==1){
                    if(count1==1){
                        img.setImageResource(R.drawable.b2);
                        fitonetitle.setText("Mountain Climber");
                        subintropage.setText(basic.get(1));
                        START_TIME_IN_MILLIS = 300000;
                        startTimer();
                    }
                    else if(count1==2){
                        img.setImageResource(R.drawable.b3);
                        fitonetitle.setText("Crunches");
                        subintropage.setText(basic.get(2));
                        START_TIME_IN_MILLIS = 300000;
                        startTimer();
                    }
                    else if(count1==3){
                        img.setImageResource(R.drawable.b4);
                        fitonetitle.setText("Pushups");
                        subintropage.setText(basic.get(3));
                        START_TIME_IN_MILLIS = 300000;
                        startTimer();
                    }
                    else{
                        Intent a = new Intent(StartWorkAct.this,exercises.class);
                        a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(a);
                    }
                    count1++;
                }
                else if(val==2){
                    if(count2==1){
                        img.setImageResource(R.drawable.i2);
                        fitonetitle.setText("Dumbbell Bench Press");
                        subintropage.setText(inter.get(1));
                        START_TIME_IN_MILLIS = 300000;
                        startTimer();
                    }
                    else if(count2==2){
                        img.setImageResource(R.drawable.i3);
                        fitonetitle.setText("Renegade Row");
                        subintropage.setText(inter.get(2));
                        START_TIME_IN_MILLIS = 300000;
                        startTimer();
                    }
                    else if(count2==3){
                        img.setImageResource(R.drawable.i4);
                        fitonetitle.setText("Weighted Step Up");
                        subintropage.setText(inter.get(3));
                        START_TIME_IN_MILLIS = 300000;
                        startTimer();
                    }
                    else{
                        Intent a = new Intent(StartWorkAct.this,screen2.class);
                        a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(a);
                    }
                    count2++;
                }
            }
        });





        if(val==1){
            img.setImageResource(R.drawable.b1);
            fitonetitle.setText("Squats");
            subintropage.setText(basic.get(0));
        }
        else if(val==2){
            img.setImageResource(R.drawable.i1);
            fitonetitle.setText("Goblet Squat");
            subintropage.setText(inter.get(0));
        }




        startTimer();

    }
    private void startTimer(){
        countDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDowntText();
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Congratulations!", Toast.LENGTH_SHORT).show();
            }
        }.start();
        mTimerRunning = true;
    }

    private void updateCountDowntText(){
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeft = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timerValue.setText(timeLeft);
    }


}