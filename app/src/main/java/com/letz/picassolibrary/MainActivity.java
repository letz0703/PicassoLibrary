package com.letz.picassolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image= findViewById(R.id.iv_Main);

        String imageUrl="http://i.imgur.com/DvpvklR.png";
        Picasso.get().load(imageUrl).into(image);

        Picasso.get()
                .load(imageUrl)
                .resize(50, 50)
                .centerCrop()
                .into(image);
    }

}