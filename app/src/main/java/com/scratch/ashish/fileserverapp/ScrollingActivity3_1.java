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

public class ScrollingActivity3_1 extends AppCompatActivity implements View.OnClickListener {
    private CardView card,card1,card2,card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_activity3_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        card = (CardView)findViewById(R.id.Card_View3_1_1);
        card.setOnClickListener(this);
        card1 = (CardView)findViewById(R.id.Card_View3_1_2);
        card1.setOnClickListener(this);
        card2 = (CardView)findViewById(R.id.Card_View3_1_3);
        card2.setOnClickListener(this);
        card3 = (CardView)findViewById(R.id.Card_View3_1_4);
        card3.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
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
        switch(view.getId()){
            case R.id.Card_View3_1_1:
                Intent intent = new Intent(this, Biotech1.class);
                startActivity(intent);
                break;
            case R.id.Card_View3_1_2:
                Intent intent1 = new Intent(this, Biotech2.class);
                startActivity(intent1);
                break;
            case R.id.Card_View3_1_3:
                Intent intent2 = new Intent(this, Biotech3.class);
                startActivity(intent2);
                break;
            case R.id.Card_View3_1_4:
                Intent intent3 = new Intent(this, Biotech4.class);
                startActivity(intent3);
                break;
        }

    }
}
