package com.luchoc.androiddiceroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView dicePlaceholder;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dicePlaceholder = findViewById(R.id.dice_placeholder);
        dicePlaceholder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int nextRandomDice = random.nextInt(6) + 1;

        switch (nextRandomDice) {
            case 1:
                dicePlaceholder.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dicePlaceholder.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dicePlaceholder.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dicePlaceholder.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dicePlaceholder.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dicePlaceholder.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
