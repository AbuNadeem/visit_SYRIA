package com.example.abu_nadeem.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutusActivity extends AppCompatActivity {
    private String urlB = "https://macdiscussions.udacity.com/u/batoulabuali";
    private String urlM = "https://macdiscussions.udacity.com/u/abunadeem";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus);
    }

    public void goToBatoolUrl(View view) {
        Uri uriUrl = Uri.parse(urlB);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void goToMohammadUrl(View view) {
        Uri uriUrl = Uri.parse(urlM);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
