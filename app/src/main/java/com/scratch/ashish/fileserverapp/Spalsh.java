package com.scratch.ashish.fileserverapp;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.scratch.ashish.fileserverapp.activities.ListFileActivity;

/**
 * Created by ashish on 19/10/16.
 */

public class Spalsh extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1500;
    Context context;
    ConnectivityManager cm;
    NetworkInfo netInfo;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.layout);
        context = this;

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Spalsh.this, ListFileActivity.class);
                Spalsh.this.startActivity(mainIntent);
                Spalsh.this.finish();
            }

        }, SPLASH_DISPLAY_LENGTH);

    }




    public boolean isOnline(Context context) {
        boolean isOnline = true;
        ConnectivityManager cm =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if(activeNetwork != null && (activeNetwork.isConnected()))
        {
            isOnline  = true;
        }


        return isOnline;

    }


}
