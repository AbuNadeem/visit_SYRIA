package com.example.abu_nadeem.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ViewSwitcher;


public class gallery extends AppCompatActivity {

    ImageSwitcher imageSwitcher;  // Array of Image IDs to Show In ImageSwitcher
    int imageIds[] = {R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6,
            R.drawable.a11, R.drawable.a12, R.drawable.a15, R.drawable.a20,
            R.drawable.a21, R.drawable.a32, R.drawable.a47, R.drawable.a80};
    int count = imageIds.length;
    // to keep current Index of ImageID array
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        // get The references of Button and ImageSwitcher
        Button btnNext = (Button) findViewById(R.id.buttonNext);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.simpleImageSwitcher);


        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory()

        {


            public View makeView() {
// TODO Auto-generated method stub

// Create a new ImageView and set it's properties
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
                return imageView;
            }


        });


        // Declare in and out animations and load them using AnimationUtils class
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        //  set the animation type to ImageSwitcher
        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);
//loading first image as default img
        imageSwitcher.setImageResource(imageIds[currentIndex]);
    }


    // When clicked on Button ImageSwitcher will switch between Images

    public void nxt(View view) {
        currentIndex++;
        //  Check If index reaches maximum then reset it
        if (currentIndex == count)
            currentIndex = 0;
        imageSwitcher.setImageResource(imageIds[currentIndex]); // set the image in ImageSwitcher
    }

    public void prev(View view) {
        currentIndex--;
        //  Check If index reaches minimum then reset it
        if (currentIndex == -1)
            currentIndex = count - 1;
        imageSwitcher.setImageResource(imageIds[currentIndex]); // set the image in ImageSwitcher


    }
}

