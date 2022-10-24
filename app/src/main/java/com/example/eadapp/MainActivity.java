package com.example.eadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    ImageView startupImg;
    Animation fade;
    private static final int STARTUP_SCREEN = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(
                R.anim.enter_activity, R.anim.exit_activity);

        // To hide status bar from the starting activity window
        getWindow().getDecorView().getWindowInsetsController().hide(
                android.view.WindowInsets.Type.statusBars()
                        | android.view.WindowInsets.Type.navigationBars()
        );

        //Animations
        fade = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        //Hooks
        startupImg = findViewById(R.id.splash_screen_img);

        //Assign Animations
        startupImg.setAnimation(fade);

        // Create an executor that executes tasks in a background thread.
        ScheduledExecutorService backgroundExecutor = Executors.newSingleThreadScheduledExecutor();

        // Execute a task in the background thread after 3 seconds.
        backgroundExecutor.schedule(() -> {
            Intent intent = new Intent(MainActivity.this, Home.class);
            startActivity(intent);
            //To remove this activity from activity list we use finish() - now users cannot open startup screen by pressing bak button
            finish();
            overridePendingTransition(
                    R.anim.enter_activity, R.anim.exit_activity);
        }, STARTUP_SCREEN, TimeUnit.SECONDS);


    }
}