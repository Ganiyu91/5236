package com.example.mobileapps.enq;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        final Button bBook = (Button) findViewById(R.id.bBook);
        bBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Bookmarks.class);
                startActivity(i);
            }
        });

        final Button bEv = (Button) findViewById(R.id.bEv);
        bEv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Events.class);
                startActivity(i);
            }
        });

        final Button bSet = (Button) findViewById(R.id.bSet);
        bSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Settings.class);
                startActivity(i);
            }
        });

        final Button bHelp = (Button) findViewById(R.id.bHelp);
        bSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Help.class);
                startActivity(i);
            }
        });

        final Button bPL = (Button) findViewById(R.id.bPL);
        bSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, PL.class);
                startActivity(i);
            }
        });


    }
}
