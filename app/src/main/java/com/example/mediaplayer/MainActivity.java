package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView video = findViewById(R.id.video);
        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.mota_rabbit);
        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);
        video.start();
    }
}