package com.example.abu_nadeem.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void goToWiki(View view) {
        Intent wikisyria = new Intent(this, browser.class);
        startActivity(wikisyria, null);
    }
}
