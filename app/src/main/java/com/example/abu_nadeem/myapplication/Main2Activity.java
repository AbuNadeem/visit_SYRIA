package com.example.abu_nadeem.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
    }

    public void toAboutus(View view) {
        Intent home = new Intent(Main2Activity.this, AboutusActivity.class);
        startActivity(home, null);
    }

    public void gotowiki(View view) {
        Intent wikisy = new Intent(this, browser.class);
        startActivity(wikisy, null);
    }

    public void gotogallery(View view) {
        Intent galleryint = new Intent(this, gallery.class);
        startActivity(galleryint, null);
    }

    public void mapmsg(View view) {
        Toast.makeText(this, "Try to use Google MAPS :)", Toast.LENGTH_SHORT).show();
    }

    public void helpmsg(View view) {
        Toast.makeText(this, "Coming soon,NEXT update", Toast.LENGTH_SHORT).show();
    }
}
