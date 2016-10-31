package com.scratch.ashish.fileserverapp;

import android.app.DownloadManager;
import android.app.Notification;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;
import java.util.ArrayList;

import static android.R.attr.action;
import static android.content.Context.DOWNLOAD_SERVICE;
import static android.content.Intent.getIntent;

/**
 * Created by ashish on 23/8/16.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> implements View.OnClickListener {
    private ArrayList<AndroidVersions> android;
    public ArrayList<String> list = new ArrayList<>();
    public  Uri url;
    private Context context;
    public int position;
    private DownloadManager downloadManager = null;
    private long id;
    public Uri uri;










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

    @Override
    public void onClick(View v) {

    }
    /*public class DownloadBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();

            if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)) {
                //request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                context.registerReceiver(receiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
            }
        }
    }*/


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
            /*String servicestring = DOWNLOAD_SERVICE;
            DownloadManager downloadmanager;
            downloadmanager = (DownloadManager) context.getSystemService(servicestring);
            */
             url = Uri
                    .parse(list.get(position));
            uri = Uri
                    .parse(list.get(position));
            System.out.println(url +"\n" +uri);
            MimeTypeMap myMime = MimeTypeMap.getSingleton();
            String mimeType = myMime.getMimeTypeFromExtension(String.valueOf(uri));


            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(uri)));
           // intent.setDataAndType(Uri.parse(String.valueOf(uri)),mimeType);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

            if (url.toString().contains(".doc") || url.toString().contains(".docx")) {
                // Word document
                intent.setDataAndType(uri, "application/msword");
            }
            else if(url.toString().contains(".pdf")) {
                // PDF file
                intent.setDataAndType(uri, "application/pdf");
            }
            else if(url.toString().contains(".ppt") || url.toString().contains(".pptx")) {
                // Powerpoint file
                intent.setDataAndType(uri, "application/vnd.ms-powerpoint");
            }
            else if(url.toString().contains(".xls") || url.toString().contains(".xlsx")) {
                // Excel file
                intent.setDataAndType(uri, "application/vnd.ms-excel");
            }
            else if(url.toString().contains(".zip") || url.toString().contains(".rar")) {
                // WAV audio file
                intent.setDataAndType(uri, "application/x-wav");
            }
            else if(url.toString().contains(".rtf")) {
                // RTF file
                intent.setDataAndType(uri, "application/rtf");
            }
            else if(url.toString().contains(".wav") || url.toString().contains(".mp3")) {
                // WAV audio file
                intent.setDataAndType(uri, "audio/x-wav");
            }
            else if(url.toString().contains(".gif")) {
                // GIF file
                intent.setDataAndType(uri, "image/gif");
            }
            else if(url.toString().contains(".jpg") || url.toString().contains(".jpeg") || url.toString().contains(".png")) {
                // JPG file
                intent.setDataAndType(uri, "image/jpeg");
            }
            else if(url.toString().contains(".txt")) {
                // Text file
                intent.setDataAndType(uri, "text/plain");
            }
            else if(url.toString().contains(".3gp") || url.toString().contains(".mpg") || url.toString().contains(".mpeg") || url.toString().contains(".mpe") || url.toString().contains(".mp4") || url.toString().contains(".avi")) {
                // Video files
                intent.setDataAndType(uri, "video/*");
            }
            if (intent.resolveActivity( context.getPackageManager()) != null){
                context.startActivity(intent);
            } else {
                Toast.makeText(context, "no activity found", Toast.LENGTH_SHORT).show();
            }







            /*DownloadManager.Request request = new DownloadManager.Request(uri);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            }
            downloadmanager.enqueue(request);

            Toast toast = Toast.makeText(context,"Your file is now downloading...", (int) 0.3);
            toast.show();
            */





            }




    }





}


