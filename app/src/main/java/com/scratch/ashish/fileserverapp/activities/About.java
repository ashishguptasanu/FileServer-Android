package com.scratch.ashish.fileserverapp.activities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.scratch.ashish.fileserverapp.R;

public class About extends AppCompatActivity implements View.OnClickListener {
    private ImageButton img, img2;
    private Context context;
    String facebookUrl = "https://www.facebook.com/fileserverjiit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        img = (ImageButton) findViewById(R.id.fb);
        img.setOnClickListener(this);
        img2 = (ImageButton) findViewById(R.id.play_store);
        img2.setOnClickListener(this);


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
        } else if (id == R.id.about) {
            Intent intent_about = new Intent(this, About.class);
            startActivity(intent_about);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fb:
                try {
                    int versionCode = getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
                    if (versionCode >= 3002850) {
                        Uri uri = Uri.parse("fb://facewebmodal/f?href=" + facebookUrl);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri));
                        ;
                    } else {
                        // open the Facebook app using the old method (fb://profile/id or fb://page/id)
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/1772396386367522")));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    // Facebook is not installed. Open the browser
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl)));
                }
                break;
            case R.id.play_store:
                final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
                break;
        }
        }
    }


