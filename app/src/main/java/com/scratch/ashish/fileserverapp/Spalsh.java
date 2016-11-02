package com.scratch.ashish.fileserverapp;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.scratch.ashish.fileserverapp.activities.ListFileActivity;

/**
 * Created by ashish on 19/10/16.
 */

public class Spalsh extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1500;
    Context context;
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
                context = getApplicationContext();
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                if (cm.getActiveNetworkInfo() == null) {
                    context = getApplicationContext();
                    Toast toast = Toast.makeText(context, "You are not connected to any network", 1);
                    toast.show();
                }
                else{
                Intent mainIntent = new Intent(Spalsh.this,ListFileActivity.class);
                Spalsh.this.startActivity(mainIntent);
                Spalsh.this.finish();
                }
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}
