package com.example.uts_ichlasularkan_zodiac;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    Animation logo_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        logo_splash = AnimationUtils.loadAnimation(this,R.anim.logo_splash);

        logo.startAnimation(logo_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abc = new Intent(MainActivity.this,ZodiacHome.class);
                startActivity(abc);
                finish();
            }
        },2000);
    }
}
