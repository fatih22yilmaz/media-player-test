package com.example.fatihyilmaz.mediaplayertest;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    int timer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.amelie);

        Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        Button stopButton = findViewById(R.id.stop_button);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });

        Button pauseButton = findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

        Button seekForward = findViewById(R.id.seek_forward_button);
        seekForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer += 3000;
                mediaPlayer.seekTo(timer);
            }
        });

        Button seekBackward = findViewById(R.id.seek_backward_button);
        seekBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer -= 3000;
                mediaPlayer.seekTo(timer);
            }
        });

    }


}
