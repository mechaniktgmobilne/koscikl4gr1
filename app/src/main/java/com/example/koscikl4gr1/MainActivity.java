package com.example.koscikl4gr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button buttonRzuc;
    private Button buttonReset;

    private ImageView[] obrazyKosci;
    private TextView textViewWynikRzutu;
    private TextView textViewWynikSumaryczny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonReset = findViewById(R.id.button2);
        buttonRzuc = findViewById(R.id.button);

        obrazyKosci = new ImageView[5];
        obrazyKosci[0] = findViewById(R.id.imageView);
        obrazyKosci[1] = findViewById(R.id.imageView2);
        obrazyKosci[2] = findViewById(R.id.imageView3);
        obrazyKosci[3] = findViewById(R.id.imageView4);
        obrazyKosci[4] = findViewById(R.id.imageView5);

        textViewWynikRzutu = findViewById(R.id.textView);
        textViewWynikSumaryczny = findViewById(R.id.textView2);


        buttonRzuc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int[] rzuty = rzucWszystkimiKoscmi();
                    }
                }
        );
    }
    private int[] rzucWszystkimiKoscmi(){
        int[] rzuty = new int[5];
        Random random = new Random();
        for (int i = 0; i < rzuty.length; i++) {
            rzuty[i] = random.nextInt(6);//+1 lub potem przy odczycie grafiki -1
        }
        return rzuty;
    }
}