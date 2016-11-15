package com.scratch.ashish.fileserverapp.activities;

import android.app.DownloadManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Switch;
import android.widget.Toast;

import com.scratch.ashish.fileserverapp.R;


public class Settings extends AppCompatActivity implements View.OnClickListener {
    protected CardView card1, card2, card3;
    private Switch krspush, egspush;
    public static final String PREFS_NAME = "SwitchButton";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        krspush = (Switch) findViewById(R.id.switch1);
        krspush.setOnClickListener(this);
        egspush = (Switch) findViewById(R.id.switch2);
        egspush.setOnClickListener(this);
        card1 = (CardView) findViewById(R.id.Set3);
        assert card1 != null;
        card1.setOnClickListener((OnClickListener) this);
        SharedPreferences sharedPrefs = getSharedPreferences("SwitchButton", MODE_PRIVATE);
        krspush.setChecked(sharedPrefs.getBoolean("onKrsClick",false));
        egspush.setChecked(sharedPrefs.getBoolean("onEgsClick",false));




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


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Set3:
                Toast.makeText(getApplicationContext(),
                        "Location: /Downloads/", Toast.LENGTH_LONG).show();
                break;
            case R.id.switch1:
                boolean on = ((Switch) v).isChecked();
                if (on) {
                    SharedPreferences.Editor editor = getSharedPreferences("SwitchButton", MODE_PRIVATE).edit();
                    editor.putBoolean("onKrsClick", true);
                    editor.commit();
                    String response = "SendNetworkUpdateAppRequest();";
                    if(response.equals("YES")){
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("URL TO LATEST APK")));
                    }

                } else {
                    SharedPreferences.Editor editor = getSharedPreferences("SwitchButton", MODE_PRIVATE).edit();
                    editor.putBoolean("onKrsClick", false);
                    editor.commit();

                }
                break;
            case R.id.switch2:
                on = ((Switch) v).isChecked();
                if (on) {
                    SharedPreferences.Editor editor = getSharedPreferences("SwitchButton", MODE_PRIVATE).edit();
                    editor.putBoolean("onEgsClick", true);
                    editor.commit();


                } else {
                    SharedPreferences.Editor editor = getSharedPreferences("SwitchButton", MODE_PRIVATE).edit();
                    editor.putBoolean("onEgsClick", false);
                    editor.commit();

                }
                break;

        }
    }
}
