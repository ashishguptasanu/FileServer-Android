package com.scratch.ashish.fileserverapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.iid.FirebaseInstanceId;

public class ScrollingActivityMAIN extends AppCompatActivity implements View.OnClickListener {
    protected CardView card1, card2;
    private Context context;
    private static final String TAG = "ScrollingActivityMAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Token: " + token);
        System.out.println(token);

        context = getApplicationContext();
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-4041777664387265/3136433230");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        card1 = (CardView) findViewById(R.id.Card_View_main);
        assert card1 != null;
        card1.setOnClickListener(this);
        card2 = (CardView) findViewById(R.id.Card_View7);
        assert card2 != null;
        card2.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Next Update: Saturday", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent_setting = new Intent(this, Settings.class);
            startActivity(intent_setting);
            return true;
        }
        else if(id == R.id.about) {
            Intent intent_about = new Intent(this, About.class);
            startActivity(intent_about);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Card_View_main:
                //Toast toast = Toast.makeText(context, "Launching Soon..", 1);
                //toast.show();
                Intent intent = new Intent(this, ScrollingActivity.class);
                startActivity(intent);
                break;
            case R.id.Card_View7:
                Intent intent2 = new Intent(this, ScrollingActivity7_0.class);
                startActivity(intent2);
                break;
        }

    }

}
