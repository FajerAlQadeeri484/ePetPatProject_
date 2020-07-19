package com.example.epetpat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_details);

        Bundle b2 = getIntent().getExtras();
        Video v = (Video) b2.getSerializable("video");

        Button title = findViewById(R.id.button3);
        VideoView videoView = findViewById(R.id.videoView);

        title.setText(v.getVideoTitle());
        videoView.setVideoPath(v.getVideo()+"");
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(videoDetails.this,CatInfo1.class);
                startActivity(back);
            }
        });
    }
}