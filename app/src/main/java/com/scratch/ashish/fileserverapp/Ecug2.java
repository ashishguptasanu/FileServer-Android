package com.scratch.ashish.fileserverapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Ecug2 extends AppCompatActivity implements View.OnClickListener{
    private Context context;
    private CardView card1, card2,card3,card4,card5,card6,card7,card8,card9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecug2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        context = getApplicationContext();
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-4041777664387265/3136433230");
        AdView mAdView = (AdView) findViewById(R.id.adViewEcug2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        card1 = (CardView)findViewById(R.id.Card_View_Ecug2_1);
        card1.setOnClickListener(this);
        card2 = (CardView)findViewById(R.id.Card_View_Ecug2_2);
        card2.setOnClickListener(this);
        card3 = (CardView)findViewById(R.id.Card_View_Ecug2_3);
        card3.setOnClickListener(this);
        card4 = (CardView)findViewById(R.id.Card_View_Ecug2_4);
        card4.setOnClickListener(this);
        card5 = (CardView)findViewById(R.id.Card_View_Ecug2_5);
        card5.setOnClickListener(this);
        card6 = (CardView)findViewById(R.id.Card_View_Ecug2_6);
        card6.setOnClickListener(this);
        card7 = (CardView)findViewById(R.id.Card_View_Ecug2_7);
        card7.setOnClickListener(this);
        card8 = (CardView)findViewById(R.id.Card_View_Ecug2_8);
        card8.setOnClickListener(this);
        card9 = (CardView)findViewById(R.id.Card_View_Ecug2_9);
        card9.setOnClickListener(this);

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
        switch(v.getId()){
            case R.id.Card_View_Ecug2_1:
                Intent intent1 = new Intent(this, Ecug2_1.class);
                startActivity(intent1);
                break;
            case R.id.Card_View_Ecug2_2:
                Intent intent2 = new Intent(this, Ecug2_2.class);
                startActivity(intent2);
                break;
            case R.id.Card_View_Ecug2_3:
                Intent intent3 = new Intent(this, Ecug2_3.class);
                startActivity(intent3);
                break;
            case R.id.Card_View_Ecug2_4:
                Intent intent4 = new Intent(this, Ecug2_4.class);
                startActivity(intent4);
                break;
            case R.id.Card_View_Ecug2_5:
                Intent intent5 = new Intent(this, Ecug2_5.class);
                startActivity(intent5);
                break;
            case R.id.Card_View_Ecug2_6:
                Intent intent6 = new Intent(this, Ecug2_6.class);
                startActivity(intent6);
                break;
            case R.id.Card_View_Ecug2_7:
                Intent intent7 = new Intent(this, Ecug2_7.class);
                startActivity(intent7);
                break;
            case R.id.Card_View_Ecug2_8:
                Intent intent8 = new Intent(this, Ecug2_8.class);
                startActivity(intent8);
                break;
            case R.id.Card_View_Ecug2_9:
                Intent intent9 = new Intent(this, Ecug2_9.class);
                startActivity(intent9);
                break;

        }

    }
}
