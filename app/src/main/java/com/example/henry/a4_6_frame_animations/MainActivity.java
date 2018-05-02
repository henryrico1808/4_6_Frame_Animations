package com.example.henry.a4_6_frame_animations;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable mickeyAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =findViewById(R.id.animation);
        if (imageView == null) throw new AssertionError();

        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.mickey);

        mickeyAnimation = (AnimationDrawable) imageView.getBackground();
        mickeyAnimation.setOneShot(true);


    }

    public void onStartBtnClick(View v) {
        imageView.setVisibility(View.VISIBLE);
        if (mickeyAnimation.isRunning()) {
            mickeyAnimation.stop();
        }
        mickeyAnimation.start();
    }

    public void onStopBtnClick(View v) {
        mickeyAnimation.stop();
    }

}
