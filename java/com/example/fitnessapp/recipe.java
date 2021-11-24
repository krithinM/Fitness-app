package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class recipe extends AppCompatActivity {

    TextView title,desc;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepie);
        Intent mIntent = getIntent();
        final int val = mIntent.getIntExtra("intVariableName", 0);

        //init elements
        title=findViewById(R.id.title);
        img=findViewById(R.id.img);
        desc=findViewById(R.id.desc);


        if(val==1){
            title.setText("Leafy Walnut Salad");
            desc.setText("Ingredients: Leafy vegetables, Walnuts, Walnut oil, Sherry vinegar, Cherry tomatoes, Salt \n \nSTEPS \n1) Mix the leafy vegetables and the cherry tomatoes with the ground walnuts in a glass bowl. \n2)Add the walnut oil and the sherry vinegar to the salad and mix well. \n3)Serve with Cherry tomatoes");
            img.setImageResource(R.drawable.dd2);
        }
        else if(val==2){
            title.setText("Egg Salad");
            desc.setText("Ingredients: hard-boiled eggs, herbs, celery, and crisp onion \n \nSTEPS \n1)Boil eggs and cool then cut into desired pieces. \n2)Finely chop the celery and red onion. \n3)Prepare homemade dressing, stir the ingredients together in a bowl. \n4)Mix salad well to combine and coat in the dressing.");
            img.setImageResource(R.drawable.dd3);

        }
        else if(val==3){
            title.setText("Cabbage Diet Soup");
            desc.setText("Ingredients: onions, carrots, celery, red bell pepper, vegetable broth, green cabbage.\n \nSTEPS \n1)Heat oil in a large pot over medium heat. Add onion, carrots and celery. Cook, stirring, until the vegetables begin to soften, 6 to 8 minutes. \n2)Add bell pepper, garlic, Italian seasoning, pepper and salt and cook, stirring, for 2 minutes. \n3)Add broth, cabbage and tomato; bring to a boil. ");
            img.setImageResource(R.drawable.dd1);
        }
    }
}
