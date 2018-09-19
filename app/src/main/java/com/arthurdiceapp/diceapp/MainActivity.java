package com.arthurdiceapp.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.Random;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button rollButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButtton;
        rollButtton = (Button) findViewById(R.id.btnLancarDado);
        //o statement final define que essa avariavel não pode mais mudar de valor daqui pra frente
        final ImageView leftDice = (ImageView) findViewById(R.id.img_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.img_rightDice);

        final int[] diceArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6
        };

        rollButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random numeroAleatorio = new Random();
                int number = numeroAleatorio.nextInt(diceArray.length);
                leftDice.setImageResource(diceArray[number]);
                number = numeroAleatorio.nextInt(diceArray.length);
                rightDice.setImageResource(diceArray[number]);


            }
        });


    }


}
