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
    int imageIds[] = {R.drawable.batool_profile, R.drawable.muhammed_profile, R.drawable.batool_profile, R.drawable.muhammed_profile, R.drawable.batool_profile};
    int count = imageIds.length;
    // to keep current Index of ImageID array
    int currentIndex = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        // get The references of Button and ImageSwitcher
        Button btnNext = (Button) findViewById(R.id.buttonNext);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.simpleImageSwitcher);
        imageSwitcher.setImageResource(imageIds[0]);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory()

        {


            public View makeView() {
// TODO Auto-generated method stub

// Create a new ImageView and set it's properties
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
                return imageView;
            }


        });


        // Declare in and out animations and load them using AnimationUtils class
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);
    }


    //  set the animation type to ImageSwitcher

    // ClickListener for NEXT button
    // When clicked on Button ImageSwitcher will switch between Images
    // The current Image will go OUT and next Image  will come in with specified animation
    public void nxt(View view) {
        currentIndex++;
        //  Check If index reaches maximum then reset it
        if (currentIndex == count)
            currentIndex = 0;
        imageSwitcher.setImageResource(imageIds[currentIndex]); // set the image in ImageSwitcher
    }

    public void prev(View view) {
        currentIndex--;
        //  Check If index reaches maximum then reset it
        if (currentIndex == count)
            currentIndex = 0;
        imageSwitcher.setImageResource(imageIds[currentIndex]); // set the image in ImageSwitcher


    }
}

