package com.itproger.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView mLeftImageView;
    private ImageView mRightImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollDicesButton = (Button) findViewById(R.id.button_roll);
        mLeftImageView = (ImageView) findViewById(R.id.imageview_left);
        mRightImageView = (ImageView) findViewById(R.id.imageview_right);

        rollDicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = randomDiceValue();
                int value2 = randomDiceValue();

                int res1 = getResources().getIdentifier("icon_" + value1, "drawable", "com.itproger.game");
                int res2 = getResources().getIdentifier("icon_" + value2, "drawable", "com.itproger.game");

                mLeftImageView.setImageResource(res1);
                mRightImageView.setImageResource(res2);
            }
        });
    }

    private int randomDiceValue() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}