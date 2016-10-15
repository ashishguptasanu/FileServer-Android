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

public class ScrollingActivity7_2 extends AppCompatActivity implements View.OnClickListener{
    private CardView card1, card2, card3, card4 ,card5, card6,card7,card8,card9,card10,card11,card12,
    card13,card14,card15,card16,card17,card18,card19,card20,card21,card22,card23,card24;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_activity7_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        card1 = (CardView)findViewById(R.id.Card_View7_2_1);
        card1.setOnClickListener(this);
        card2 = (CardView)findViewById(R.id.Card_View7_2_2);
        card2.setOnClickListener(this);
        card3 = (CardView)findViewById(R.id.Card_View7_2_3);
        card3.setOnClickListener(this);
        card4 = (CardView)findViewById(R.id.Card_View7_2_4);
        card4.setOnClickListener(this);
        card5 = (CardView)findViewById(R.id.Card_View7_2_5);
        card5.setOnClickListener(this);
        card6 = (CardView)findViewById(R.id.Card_View7_2_6);
        card6.setOnClickListener(this);
        card7 = (CardView)findViewById(R.id.Card_View7_2_7);
        card7.setOnClickListener(this);
        card8 = (CardView)findViewById(R.id.Card_View7_2_8);
        card8.setOnClickListener(this);
        card9 = (CardView)findViewById(R.id.Card_View7_2_9);
        card9.setOnClickListener(this);
        card10 = (CardView)findViewById(R.id.Card_View7_2_10);
        card10.setOnClickListener(this);
        card11 = (CardView)findViewById(R.id.Card_View7_2_11);
        card11.setOnClickListener(this);
        card12 = (CardView)findViewById(R.id.Card_View7_2_12);
        card12.setOnClickListener(this);
        card13 = (CardView)findViewById(R.id.Card_View7_2_13);
        card13.setOnClickListener(this);
        card14 = (CardView)findViewById(R.id.Card_View7_2_14);
        card14.setOnClickListener(this);
        card15 = (CardView)findViewById(R.id.Card_View7_2_15);
        card15.setOnClickListener(this);


        context = getApplicationContext();
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-4041777664387265/3136433230");
        AdView mAdView = (AdView) findViewById(R.id.adView7_2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


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
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Card_View7_2_1:
                Intent intent = new Intent(this, Mba2_Sub1.class);
                startActivity(intent);
                break;
            case R.id.Card_View7_2_2:
                Intent intent2 = new Intent(this, Mba2_Sub2.class);
                startActivity(intent2);
                break;
            case R.id.Card_View7_2_3:
                Intent intent3 = new Intent(this, Mba2_Sub3.class);
                startActivity(intent3);
                break;
            case R.id.Card_View7_2_4:
                Intent intent4 = new Intent(this, Mba2_Sub4.class);
                startActivity(intent4);
                break;
            case R.id.Card_View7_2_5:
                Intent intent5 = new Intent(this, Mba2_Sub5.class);
                startActivity(intent5);
                break;
            case R.id.Card_View7_2_6:
                Intent intent6 = new Intent(this, Mba2_Sub6.class);
                startActivity(intent6);
                break;
            case R.id.Card_View7_2_7:
                Intent intent7 = new Intent(this, Mba2_Sub7.class);
                startActivity(intent7);
                break;
            case R.id.Card_View7_2_8:
                Intent intent8 = new Intent(this, Mba2_Sub8.class);
                startActivity(intent8);
                break;
            case R.id.Card_View7_2_9:
                Intent intent9 = new Intent(this, Mba2_Sub9.class);
                startActivity(intent9);
                break;
            case R.id.Card_View7_2_10:
                Intent intent10 = new Intent(this, Mba2_Sub10.class);
                startActivity(intent10);
                break;
            case R.id.Card_View7_2_11:
                Intent intent11 = new Intent(this, Mba2_Sub11.class);
                startActivity(intent11);
                break;
            case R.id.Card_View7_2_12:
                Intent intent12 = new Intent(this, Mba2_Sub12.class);
                startActivity(intent12);
                break;
            case R.id.Card_View7_2_13:
                Intent intent13 = new Intent(this, Mba2_Sub13.class);
                startActivity(intent13);
                break;
            case R.id.Card_View7_2_14:
                Intent intent14 = new Intent(this, Mba2_Sub14.class);
                startActivity(intent14);
                break;
            case R.id.Card_View7_2_15:
                Intent intent15 = new Intent(this, Mba2_Sub15.class);
                startActivity(intent15);
                break;
            //case R.id.Card_View7_2_16:
                //Intent intent16 = new Intent(this, Mba2_Sub16.class);
                //startActivity(intent16);
                //break;
            //case R.id.Card_View7_2_17:
                //Intent intent17 = new Intent(this, Mba2_Sub17.class);
                //startActivity(intent17);
                //break;
            //case R.id.Card_View7_2_18:
                //Intent intent18 = new Intent(this, Mba2_Sub18.class);
                //startActivity(intent18);
                //break;
            //case R.id.Card_View7_2_19:
                //Intent intent19 = new Intent(this, Mba2_Sub19.class);
                //startActivity(intent19);
                //break;
            //case R.id.Card_View7_2_20:
                //Intent intent20 = new Intent(this, Mba2_Sub20.class);
                //startActivity(intent20);
                //break;
            //case R.id.Card_View7_2_21:
                //Intent intent21 = new Intent(this, Mba2_Sub21.class);
                //startActivity(intent21);
                //break;
            //case R.id.Card_View7_2_22:
                //Intent intent22 = new Intent(this, Mba2_Sub22.class);
                //startActivity(intent22);
                //break;
            //case R.id.Card_View7_2_23:
                //Intent intent23 = new Intent(this, Mba2_Sub23.class);
                //startActivity(intent23);
                //break;
            //case R.id.Card_View7_2_24:
                //Intent intent24 = new Intent(this, Mba2_Sub24.class);
                //startActivity(intent24);
                //break;

        }

    }
}
