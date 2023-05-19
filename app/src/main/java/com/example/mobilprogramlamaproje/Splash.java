package com.example.mobilprogramlamaproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity
{


    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        animationView=findViewById(R.id.animasyon);
        animationView.animate().translationY(-2000).setDuration(1300).setStartDelay(3000);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
            }
        },4000);

    }
}