package com.scratch.ashish.fileserverapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Hss4 extends AppCompatActivity implements View.OnClickListener{
    private CardView card1, card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hss4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        card1 = (CardView)findViewById(R.id.Card_View_Hss4_1);
        card1.setOnClickListener(this);
        card2 = (CardView)findViewById(R.id.Card_View_Hss4_2);
        card2.setOnClickListener(this);
        card3 = (CardView)findViewById(R.id.Card_View_Hss4_3);
        card3.setOnClickListener(this);
        card4 = (CardView)findViewById(R.id.Card_View_Hss4_4);
        card4.setOnClickListener(this);
        card5 = (CardView)findViewById(R.id.Card_View_Hss4_5);
        card5.setOnClickListener(this);
        card6 = (CardView)findViewById(R.id.Card_View_Hss4_6);
        card6.setOnClickListener(this);


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
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.Card_View_Hss4_1:
                Intent intent = new Intent(this, Hss4_Sub1.class);
                startActivity(intent);
                break;
            case R.id.Card_View_Hss4_2:
                Intent intent2 = new Intent(this, Hss4_Sub2.class);
                startActivity(intent2);
                break;
            case R.id.Card_View_Hss4_3:
                Intent intent3 = new Intent(this, Hss4_Sub3.class);
                startActivity(intent3);
                break;
            case R.id.Card_View_Hss4_4:
                Intent intent4 = new Intent(this, Hss4_Sub4.class);
                startActivity(intent4);
                break;
            case R.id.Card_View_Hss4_5:
                Intent intent5 = new Intent(this, Hss4_Sub5.class);
                startActivity(intent5);
                break;
            case R.id.Card_View_Hss4_6:
                Intent intent6 = new Intent(this, Hss4_Sub6.class);
                startActivity(intent6);
                break;

        }
    }
}
