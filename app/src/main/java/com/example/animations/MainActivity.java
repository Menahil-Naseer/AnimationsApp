package com.example.animations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=findViewById(R.id.imageView);
    }

    public void slide(View view) {
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slides);
        im.setVisibility(View.VISIBLE);
        im.startAnimation(anim);
    }

    public void rotate(View view) {
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        im.setVisibility(View.VISIBLE);
        im.startAnimation(anim);
    }

    public void zoom(View view) {
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        im.setVisibility(View.VISIBLE);
        im.startAnimation(anim);
    }

    public void blink(View view) {
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blinks);
        im.setVisibility(View.VISIBLE);
        im.startAnimation(anim);
    }

    public void fade(View view) {
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fades);
        im.setVisibility(View.VISIBLE);
        im.startAnimation(anim);
    }

    public void bounce(View view) {
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        im.setVisibility(View.VISIBLE);
        im.startAnimation(anim);
    }

    public void move(View view) {
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moved);
        im.setVisibility(View.VISIBLE);
        im.startAnimation(anim);
    }

    public void interpolar(View view) {
        Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.inter);
        im.setVisibility(View.VISIBLE);
        im.startAnimation(anim);
    }
}