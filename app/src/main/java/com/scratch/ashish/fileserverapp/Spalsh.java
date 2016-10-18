package com.scratch.ashish.fileserverapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ashish on 19/10/16.
 */

public class Spalsh extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1500;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.layout);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Spalsh.this,ScrollingActivityMAIN.class);
                Spalsh.this.startActivity(mainIntent);
                Spalsh.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}
