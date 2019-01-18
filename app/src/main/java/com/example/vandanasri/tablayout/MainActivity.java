package com.example.vandanasri.tablayout;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tabHost = getTabHost();

        // Tab for Photos
        TabHost.TabSpec photospec = tabHost.newTabSpec("Photos");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.photoo));
        Intent photosIntent = new Intent(this, Photo.class);
        photospec.setContent(photosIntent);



        // Tab for Videos
        TabHost.TabSpec videospec = tabHost.newTabSpec("Videos");
        videospec.setIndicator("Videos", getResources().getDrawable(R.drawable.songs));
        Intent videosIntent = new Intent(this, Videos.class);
        videospec.setContent(videosIntent);

        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec); // Adding photos tab
        // Adding songs tab
        tabHost.addTab(videospec); // Adding videos tab

    }
}
