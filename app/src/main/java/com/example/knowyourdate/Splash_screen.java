package com.example.knowyourdate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class Splash_screen extends AppCompatActivity {
    private static int SPLASH_TIMEOUT = 4000;
    ArrayList<String> arr = new ArrayList<String>();
    private String quote = "";
    TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        arr.add("Women may experience more stress and intense mood swings during their menstrual period. However, through avoiding certain food items and eating just the right ones, you may still feel comfortable and stress-free.");
        arr.add("The effect of heat application during menstruation period is similar to the effects of popping OTC painkillers for cramps.");
        arr.add("limit cakes, candy, breakfast cereals, pasta, white bread, and white flour.");
        arr.add("Intense physical activities, especially with extremely low caloric intake could cause menstruation to cease.");
        Random random = new Random();
        int rand_int1 = random.nextInt(4);
        quote = arr.get(rand_int1);
        tv5 = findViewById(R.id.textView5);
        tv5.setText(quote);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainActivity = new Intent(Splash_screen.this, MainActivity.class);
                startActivity(mainActivity);
                finish();
            }
        }, SPLASH_TIMEOUT);
    }
}