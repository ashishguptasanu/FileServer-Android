package com.scratch.ashish.fileserverapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity3_2 extends AppCompatActivity implements View.OnClickListener{
    private CardView card,card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_activity3_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        card = (CardView)findViewById(R.id.Card_View3_2_1);
        card.setOnClickListener(this);
        card1 = (CardView)findViewById(R.id.Card_View3_2_2);
        card1.setOnClickListener(this);

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
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.Card_View3_2_1:
                Intent intent1 = new Intent(this, Biotech5.class);
                startActivity(intent1);
                break;
            case R.id.Card_View3_2_2:
                Intent intent2 = new Intent(this, Biotech6.class);
                startActivity(intent2);
                break;
        }
    }
}
