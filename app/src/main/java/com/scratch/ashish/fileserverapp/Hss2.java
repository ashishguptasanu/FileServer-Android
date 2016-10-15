package com.scratch.ashish.fileserverapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Hss2 extends AppCompatActivity implements View.OnClickListener{
    private CardView card1, card2,card3,card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hss2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        card1 = (CardView)findViewById(R.id.Card_View_Hss2_1);
        card1.setOnClickListener(this);
        card2 = (CardView)findViewById(R.id.Card_View_Hss2_2);
        card2.setOnClickListener(this);
        card3 = (CardView)findViewById(R.id.Card_View_Hss2_3);
        card3.setOnClickListener(this);
        card4 = (CardView)findViewById(R.id.Card_View_Hss2_4);
        card4.setOnClickListener(this);

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
        switch(view.getId()){
            case R.id.Card_View_Hss2_1:
                Intent intent = new Intent(this, Hss2_Sub1.class);
                startActivity(intent);
                break;
            case R.id.Card_View_Hss2_2:
                Intent intent2 = new Intent(this, Hss2_Sub2.class);
                startActivity(intent2);
                break;
            case R.id.Card_View_Hss2_3:
                Intent intent3 = new Intent(this, Hss2_Sub3.class);
                startActivity(intent3);
                break;
            case R.id.Card_View_Hss2_4:
                Intent intent4 = new Intent(this, Hss2_Sub4.class);
                startActivity(intent4);
                break;
        }
    }
}
