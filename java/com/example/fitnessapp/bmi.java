package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
    Button calc,reset;
    ImageButton male,female;
    TextView height,weight,age,gender;
    int agee, weightt;
    float bmi,cheight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        //init elements
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        age=findViewById(R.id.age);
        calc=findViewById(R.id.compute);
        reset=findViewById(R.id.reset);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        gender=findViewById(R.id.gender);

        //OnClick Listeners
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender.setText("Male");
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender.setText("Female");
            }
        });

        //text entry
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    try{
                        cheight = Float.parseFloat(height.getText().toString());
                        weightt = Integer.parseInt(weight.getText().toString());
                        agee = Integer.parseInt(age.getText().toString());
                    }
                    catch (Exception e) {
                        Toast.makeText(bmi.this, "Enter all the values", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(cheight<70 | cheight>250){
                        Toast.makeText(bmi.this, "Enter proper height", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(weightt<30 | weightt>250){
                        Toast.makeText(bmi.this, "Enter proper weight", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if(agee<0 | agee>120){
                        Toast.makeText(bmi.this, "Enter proper Age", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    bmi = (weightt / (cheight * cheight))*10000;
                    String s = String.valueOf(bmi);
                    Intent intent = new Intent(bmi.this, bmiresult.class);
                    intent.putExtra("BMI", bmi);
                    startActivity(intent);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender.setText("");
                height.setText("");
                weight.setText("");
                age.setText("");
            }
        });

    }
}
