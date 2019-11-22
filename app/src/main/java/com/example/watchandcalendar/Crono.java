package com.example.watchandcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Crono extends AppCompatActivity {

    Chronometer crono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crono);

        Button button;
        crono = (Chronometer) findViewById(R.id.chronometer);

        button = (Button) findViewById(R.id.buttonStart);
        button.setOnClickListener(start);

        button = (Button) findViewById(R.id.buttonStop);
        button.setOnClickListener(stop);
    }

    View.OnClickListener start = new View.OnClickListener() {
        public void onClick(View v) {
            crono.setBase(SystemClock.elapsedRealtime());
            crono.start();
        }
    };

    View.OnClickListener stop = new View.OnClickListener() {
        public void onClick(View v) {
            crono.stop();
        }
    };
}
