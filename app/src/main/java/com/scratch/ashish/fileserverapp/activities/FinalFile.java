package com.scratch.ashish.fileserverapp.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.scratch.ashish.fileserverapp.AndroidVersions;
import com.scratch.ashish.fileserverapp.DataAdapter;
import com.scratch.ashish.fileserverapp.JSONResponse;
import com.scratch.ashish.fileserverapp.R;
import com.scratch.ashish.fileserverapp.models.FileActivity;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FinalFile extends AppCompatActivity {
    String subjectUrl ;
    private RecyclerView recyclerView;
    private ArrayList<AndroidVersions> data;
    private DataAdapter adapter;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_file);
        Bundle bundle =  getIntent().getExtras();
        if ( bundle!= null && bundle.containsKey("subjectid")){
            subjectUrl = bundle.getString("subjectid");
            System.out.println(subjectUrl);
        }
        initViews();
    }
    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.final_file);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        //recyclerView.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //int position = recyclerView.getAdapter().get
        // }
        // });
        loadJSON();

    }
    private void loadJSON(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://s3.ap-south-1.amazonaws.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        FileActivity request = retrofit.create(FileActivity.class);

        Call<JSONResponse> call = request.getJSON(subjectUrl);
        call.enqueue(new Callback<JSONResponse>() {
            @Override
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {

                JSONResponse jsonResponse = response.body();
                data = new ArrayList<>(Arrays.asList(jsonResponse.getAndroid()));
                adapter = new DataAdapter(data, FinalFile.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
