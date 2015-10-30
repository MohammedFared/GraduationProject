package com.example.egypt.app;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

    //play music when start app
    MediaPlayer songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Start music
        songs = MediaPlayer.create(this, R.raw.show);
        songs.start();

        final Intent intent = new Intent(this,Code.class);

        Thread mythread = new Thread() {

            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                }
            }

        };

        mythread.start();
    }

    //To stop song
    @Override
    protected void onPause() {
        super.onPause();
        songs.release();
        finish();
    }


}
