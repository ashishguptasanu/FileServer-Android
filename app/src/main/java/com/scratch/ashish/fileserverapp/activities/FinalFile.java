package com.scratch.ashish.fileserverapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.scratch.ashish.fileserverapp.R;

public class FinalFile extends AppCompatActivity {
    String subjectUrl ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_file);
        Bundle bundle =  getIntent().getExtras();
        if ( bundle!= null && bundle.containsKey("subjectid")){
            subjectUrl = bundle.getString("subjectid");
            System.out.println(subjectUrl);
        }
    }
}
