package com.example.bmitest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Scrin_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scrin);
        ImageView imageView=findViewById(R.id.iv);
        Animation anim= AnimationUtils.loadAnimation(Splash_Scrin_Activity.this,R.anim.fade_out);
        imageView.startAnimation(anim);

        Handler handler;
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation anim= AnimationUtils.loadAnimation(Splash_Scrin_Activity.this,R.anim.fade_put);
                imageView.startAnimation(anim);
            }
        },1500);


        Handler h;

        h=new Handler();
        h.postDelayed(() -> {
            Intent intent=new Intent(Splash_Scrin_Activity.this,MainActivity.class);
            startActivity(intent);
            finish();
        },2500);


    }
}