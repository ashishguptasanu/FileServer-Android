package com.scratch.ashish.fileserverapp;

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

public class ScrollingActivity1_1_3 extends AppCompatActivity implements View.OnClickListener {
    private static CardView card1,card2,card3,card4,card5,card6, card7,card8,card9,card10,card11,card12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_activity1_1_3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        card1 = (CardView) findViewById(R.id.Card_View1_1_3_1);
        card1.setOnClickListener((View.OnClickListener) this);
        card2 = (CardView) findViewById(R.id.Card_View1_1_3_2);
        card2.setOnClickListener((View.OnClickListener) this);
        card3 = (CardView) findViewById(R.id.Card_View1_1_3_3);
        card3.setOnClickListener((View.OnClickListener) this);
        card4 = (CardView) findViewById(R.id.Card_View1_1_3_4);
        card4.setOnClickListener((View.OnClickListener) this);
        card5 = (CardView) findViewById(R.id.Card_View1_1_3_5);
        card5.setOnClickListener((View.OnClickListener) this);
        card6 = (CardView) findViewById(R.id.Card_View1_1_2_6);
        card6.setOnClickListener((View.OnClickListener) this);
        card7 = (CardView) findViewById(R.id.Card_View1_1_2_7);
        card7.setOnClickListener((View.OnClickListener) this);
        card8 = (CardView) findViewById(R.id.Card_View1_1_2_8);
        card8.setOnClickListener((View.OnClickListener) this);
        card9 = (CardView) findViewById(R.id.Card_View1_1_2_9);
        card9.setOnClickListener((View.OnClickListener) this);
        card10 = (CardView) findViewById(R.id.Card_View1_1_2_10);
        card10.setOnClickListener((View.OnClickListener) this);
        card11 = (CardView) findViewById(R.id.Card_View1_1_2_11);
        card11.setOnClickListener((View.OnClickListener) this);
        card12 = (CardView) findViewById(R.id.Card_View1_1_2_12);
        card12.setOnClickListener((View.OnClickListener) this);


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
        switch (v.getId()) {
            case R.id.Card_View1_1_2_6:
                Intent intent = new Intent(this, Cs3_B_Sub6.class);
                startActivity(intent);
                break;
            case R.id.Card_View1_1_2_7:
                Intent intent2 = new Intent(this, Cs3_B_Sub7.class);
                startActivity(intent2);
                break;
            case R.id.Card_View1_1_3_1:
                Intent intent3 = new Intent(this, Cs3_B_Sub1.class);
                startActivity(intent3);
                break;
            case R.id.Card_View1_1_3_2:
                Intent intent4 = new Intent(this, Cs3_B_Sub2.class);
                startActivity(intent4);
                break;
            case R.id.Card_View1_1_3_3:
                Intent intent5 = new Intent(this, Cs3_B_Sub3.class);
                startActivity(intent5);break;
            case R.id.Card_View1_1_3_4:
                Intent intent6 = new Intent(this, Cs3_B_Sub4.class);
                startActivity(intent6);
                break;
            case R.id.Card_View1_1_3_5:
                Intent intent12 = new Intent(this, Cs3_B_Sub5.class);
                startActivity(intent12);
                break;
            case R.id.Card_View1_1_2_8:
                Intent intent7 = new Intent(this, Cs3_B_Sub8.class);
                startActivity(intent7);
                break;
            case R.id.Card_View1_1_2_9:
                Intent intent8 = new Intent(this, Cs3_B_Sub9.class);
                startActivity(intent8);
                break;
            case R.id.Card_View1_1_2_10:
                Intent intent9 = new Intent(this, Cs3_B_Sub10.class);
                startActivity(intent9);
                break;
            case R.id.Card_View1_1_2_11:
                Intent intent10 = new Intent(this, Cs3_B_Sub11.class);
                startActivity(intent10);
                break;
            case R.id.Card_View1_1_2_12:
                Intent intent11 = new Intent(this, Cs3_B_Sub12.class);
                startActivity(intent11);
                break;



        }
    }

}