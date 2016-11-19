package com.scratch.ashish.fileserverapp.adapters;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.scratch.ashish.fileserverapp.R;
import com.scratch.ashish.fileserverapp.models.GetFiles;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

import static android.content.Context.DOWNLOAD_SERVICE;

/**
 * Created by ashish on 23/8/16.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> implements View.OnClickListener {
    private ArrayList<GetFiles> android;
    public ArrayList<String> list = new ArrayList<>();
    public  Uri url;
    private Context context;
    public int position;
    private DownloadManager downloadManager = null;
    private long id;
    public Uri uri;
    String fileName;

    public DataAdapter(ArrayList<GetFiles> android, Context context) {
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
        if(Objects.equals(android.get(i).getVer(), "File Type: docx") || Objects.equals(android.get(i).getVer(), "File Type: doc")){
            viewHolder.imageFV.setImageDrawable(context.getResources().getDrawable(R.drawable.doc));
        }
        else if(Objects.equals(android.get(i).getVer(), "File Type: pdf")){
            viewHolder.imageFV.setImageDrawable(context.getResources().getDrawable(R.drawable.pdf));
        }
        else if(Objects.equals(android.get(i).getVer(), "File Type: ppt") || (Objects.equals(android.get(i).getVer(), "File Type: pptx"))){
            viewHolder.imageFV.setImageDrawable(context.getResources().getDrawable(R.drawable.ppt));
        }
        else if(Objects.equals(android.get(i).getVer(), "File Type: txt")){
            viewHolder.imageFV.setImageDrawable(context.getResources().getDrawable(R.drawable.txt));
        }
        else if(Objects.equals(android.get(i).getVer(), "File Type: xlsx") || Objects.equals(android.get(i).getVer(), "File Type: xls")){
            viewHolder.imageFV.setImageDrawable(context.getResources().getDrawable(R.drawable.xls));
        }
        else if(Objects.equals(android.get(i).getVer(), "File Type: zip")){
            viewHolder.imageFV.setImageDrawable(context.getResources().getDrawable(R.drawable.zip));
        }
        else{
            viewHolder.imageFV.setImageDrawable(context.getResources().getDrawable(R.drawable.file));
        }
        //url = android.get(i).getApi();
        for(int j=0; j<android.size();j++){
            list.add(android.get(j).getApi());
            //System.out.println(android.get(j).getVer());
        }






    }


    @Override
    public int getItemCount() {
        return android.size();
    }

    @Override
    public void onClick(View v) {

    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tv_name,tv_version;
        public ImageView imageFV;

        ArrayList<GetFiles> android = new ArrayList<GetFiles>();


        public ViewHolder(View view) {
            super(view);



            tv_name = (TextView)view.findViewById(R.id.tv_name);
            tv_version = (TextView)view.findViewById(R.id.tv_version);
            imageFV = (ImageView)view.findViewById(R.id.imageFileType);



            view.setOnClickListener(this);
            //for(int i=0; i< android.size();i++){
            //    System.out.println(android.get(i));
            //}

        }
        @Override


        public void onClick(View view) {
            position = getAdapterPosition();
            url = Uri
                    .parse(list.get(position));
            fileName = FilenameUtils.getName(url.getPath());
            File file = new File("/data/user/0/com.android.providers.downloads/cache/" + fileName);
            if (!file.exists()) {
                //System.out.println(position);
                String servicestring = DOWNLOAD_SERVICE;
                DownloadManager downloadmanager;
                downloadmanager = (DownloadManager) context.getSystemService(servicestring);

                url = Uri
                        .parse(list.get(position));
                uri = Uri
                        .parse(list.get(position));

                DownloadManager.Request request = new DownloadManager.Request(uri);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                }
                downloadmanager.enqueue(request);

                Toast toast = Toast.makeText(context, "Your file is now downloading", (int) 0.3);
                toast.show();
            } else {

                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
                dialogBuilder.setIcon(R.drawable.ic_get_app_black_24dp);
                dialogBuilder.setTitle("Warning");
                dialogBuilder.setMessage("File already exist, Go to Downloads");
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();
            }


        }




    }





}


