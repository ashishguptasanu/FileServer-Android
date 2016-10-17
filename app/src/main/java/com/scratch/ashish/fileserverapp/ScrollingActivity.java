package com.scratch.ashish.fileserverapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class ScrollingActivity extends AppCompatActivity implements View.OnClickListener {
    protected CardView card , card1,card2,card3,card6,card5,card4;
    private Context context;
    private String msg = "Last Updated: yesterday";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        context = getApplicationContext();
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-4041777664387265/3136433230");
        AdView mAdView = (AdView) findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        card = (CardView) findViewById(R.id.Card_View1);
        assert card != null;
        card.setOnClickListener(this);
        card1 = (CardView) findViewById(R.id.Card_View2);
        assert card1 != null;
        card1.setOnClickListener(this);
        card2 = (CardView) findViewById(R.id.Card_View3);
        assert card2 != null;
        card2.setOnClickListener(this);
        card3 = (CardView) findViewById(R.id.Card_View4);
        assert card3 != null;
        card3.setOnClickListener(this);
        card4 = (CardView) findViewById(R.id.Card_View5);
        assert card4 != null;
        card4.setOnClickListener(this);
        card5 = (CardView) findViewById(R.id.Card_View6);
        assert card5 != null;
        card5.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,msg, Snackbar.LENGTH_LONG)
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

        switch (v.getId()) {
            case R.id.Card_View1:
                 Intent intent = new Intent(this, ScrollingActivity2.class);
                 startActivity(intent);
                //Toast toast = Toast.makeText(context, "Launching Soon..", 1);
                //toast.show();
                break;
            case R.id.Card_View2:
                Intent intent2 =  new Intent(this,ScrollingActivity2_0.class);
                startActivity(intent2);

                break;
            case R.id.Card_View3:
                Intent intent3 = new Intent(this, ScrollingActivity3_0.class);
                startActivity(intent3);
                //Toast toast3 = Toast.makeText(context, "Launching Soon..", 1);
                //toast3.show();
                break;
            case R.id.Card_View4:
                Intent intent4 = new Intent(this, ScrollingActivity4_0.class);
                startActivity(intent4);
                break;
            case R.id.Card_View7:
                //Intent intent7 = new Intent(this, ScrollingActivity7_0.class);
                //startActivity(intent7);
                Toast toast4 = Toast.makeText(context, "Launching Soon..", 1);
                toast4.show();
                break;
            case R.id.Card_View5:
                Intent intent5 = new Intent(this, ScrollingActivity5_1.class);
                startActivity(intent5);
                break;
            case R.id.Card_View6:
                Intent intent6 = new Intent(this, ScrollingActivity6_1.class);
                startActivity(intent6);
                break;


        }



    }
}
