package com.scratch.ashish.fileserverapp;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ashish on 23/8/16.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>  {
    private ArrayList<AndroidVersions> android;
    public ArrayList<String> list = new ArrayList<>();
    public  String url;
    private Context context;
    public int position;




    public DataAdapter(ArrayList<AndroidVersions> android, Context context) {
        this.android = android;
        this.context = context;


    }



    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final DataAdapter.ViewHolder viewHolder, int i){

        viewHolder.tv_name.setText(android.get(i).getName());
        viewHolder.tv_version.setText(android.get(i).getVer());
        //url = android.get(i).getApi();
        for(int j=0; j<android.size();j++){
            list.add(android.get(j).getApi());
        }



        //viewHolder.tv_api_level.setText(android.get(i).getApi());


    }


    @Override
    public int getItemCount() {
        return android.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tv_name,tv_version;

        ArrayList<AndroidVersions> android = new ArrayList<AndroidVersions>();


        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView)view.findViewById(R.id.tv_name);
            tv_version = (TextView)view.findViewById(R.id.tv_version);

            view.setOnClickListener(this);
            for(int i=0; i< android.size();i++){
                System.out.println(android.get(i));
            }



        }


        @Override

        public void onClick(View view) {
            position = getAdapterPosition();
            //System.out.println(position);
            System.out.println(list.get(position));
            String servicestring = context.DOWNLOAD_SERVICE;
            DownloadManager downloadmanager;
            downloadmanager = (DownloadManager) context.getSystemService(servicestring);
            Uri uri = Uri
                    .parse(list.get(position));
            DownloadManager.Request request = new DownloadManager.Request(uri);
            downloadmanager.enqueue(request);
            Toast toast = Toast.makeText(context,"Your file is now downloading...", (int) 0.3);
            toast.show();


            
            }



    }


}

