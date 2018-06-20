package com.example.birmachera.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        downloadImage();
    }

    protected void downloadImage() {
        Glide.with(getApplicationContext()).load("http://via.placeholder.com/300.png").into((ImageView)findViewById(R.id.imageView));
    }
}
