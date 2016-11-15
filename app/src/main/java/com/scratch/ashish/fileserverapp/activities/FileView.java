package com.scratch.ashish.fileserverapp.activities;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.scratch.ashish.fileserverapp.models.GetFiles;
import com.scratch.ashish.fileserverapp.adapters.DataAdapter;
import com.scratch.ashish.fileserverapp.models.JSONResponse;
import com.scratch.ashish.fileserverapp.R;
import com.scratch.ashish.fileserverapp.models.FileActivity;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FileView extends AppCompatActivity {
    String subjectUrl ;
    private RecyclerView recyclerView;
    private ArrayList<GetFiles> data;
    private DataAdapter adapter;
    private ProgressBar progressBar;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_file);
        Bundle bundle =  getIntent().getExtras();
        if ( bundle!= null && bundle.containsKey("subjectid")){
            subjectUrl = bundle.getString("subjectid");
        }
        initViews();
    }
    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.final_file);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        //recyclerView.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View view) {
        //int position = recyclerView.getAdapter().get
        // }
        // });
        progressBar.setVisibility(View.VISIBLE);
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
                progressBar.setVisibility(View.GONE);
                JSONResponse jsonResponse = response.body();
                data = new ArrayList<>(Arrays.asList(jsonResponse.getAndroid()));
                adapter = new DataAdapter(data, FileView.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
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
        else if(id == R.id.action_download){
            Intent intent_download = new Intent(DownloadManager.ACTION_VIEW_DOWNLOADS);
            startActivity(intent_download);
        }
        return super.onOptionsItemSelected(item);
    }
}
