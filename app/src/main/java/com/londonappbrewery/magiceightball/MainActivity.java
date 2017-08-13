package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Ask = (Button) findViewById(R.id.Askbutton);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_8ball);
        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        Ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Magic", "Button is clicked");
                Random nmbr = new Random();
                int number =nmbr.nextInt(5);
                Log.d("Magic","the random number is" + number);
                ballDisplay.setImageResource(ballArray[number]);

            }
        });
    }
}
