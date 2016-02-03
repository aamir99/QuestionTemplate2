package com.aamirislam.questiontemplate2;

import android.content.Context;
import android.graphics.Color;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
public Button btnA, btnB, btnC, btnD, btnE;
public TextView ansA, ansB, ansC, ansD, ansE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialization
        btnA = (Button)findViewById(R.id.aButton);
        btnB = (Button)findViewById(R.id.bButton);
        btnC = (Button)findViewById(R.id.cButton);
        btnD = (Button)findViewById(R.id.dButton);
        btnE = (Button)findViewById(R.id.eButton);
        ansA = (TextView)findViewById(R.id.textA);
        ansB = (TextView)findViewById(R.id.textB);
        ansC = (TextView)findViewById(R.id.textC);
        ansD = (TextView)findViewById(R.id.textD);
        ansE = (TextView)findViewById(R.id.textE);
        //OnClick
        btnA.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                ansA.setTextColor(Color.RED);
                ansB.setTextColor(Color.BLACK);
                ansC.setTextColor(Color.BLACK);
                ansD.setTextColor(Color.BLACK);
                ansE.setTextColor(Color.BLACK);
                Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(350);
            }
        });
        btnB.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                ansA.setTextColor(Color.BLACK);
                ansB.setTextColor(Color.GREEN);
                ansC.setTextColor(Color.BLACK);
                ansD.setTextColor(Color.BLACK);
                ansE.setTextColor(Color.BLACK);
            }
        });
        btnC.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                ansA.setTextColor(Color.BLACK);
                ansB.setTextColor(Color.BLACK);
                ansC.setTextColor(Color.RED);
                ansD.setTextColor(Color.BLACK);
                ansE.setTextColor(Color.BLACK);
                Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(350);
            }
        });
        btnD.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                ansA.setTextColor(Color.BLACK);
                ansB.setTextColor(Color.BLACK);
                ansC.setTextColor(Color.BLACK);
                ansD.setTextColor(Color.RED);
                ansE.setTextColor(Color.BLACK);
                Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(350);
            }
        });
        btnE.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                ansA.setTextColor(Color.BLACK);
                ansB.setTextColor(Color.BLACK);
                ansC.setTextColor(Color.BLACK);
                ansD.setTextColor(Color.BLACK);
                ansE.setTextColor(Color.RED);
                Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vib.vibrate(350);
            }
        });
    }
}
