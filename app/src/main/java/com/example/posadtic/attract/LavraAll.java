package com.example.posadtic.attract;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.posadtic.Dashboard;
import com.example.posadtic.R;
import com.example.posadtic.hotels.ApartmentsAll;
import com.example.posadtic.hotels.GuesthousesAll;
import com.example.posadtic.hotels.HotelView;

public class LavraAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lavra_all);

        CardView button1 = (CardView) findViewById(R.id.museums_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, MuseumsAll.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.religions_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, ReligionsAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.walk_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, WalksAll.class);
                startActivity(intent);
            }
        });

        /// Лавра ////
        LinearLayout attract1 = (LinearLayout )findViewById(R.id.attract_1);
        attract1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract1.class);
                startActivity(intent);
            }
        });
        LinearLayout attract2 = (LinearLayout )findViewById(R.id.attract_2);
        attract2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract2.class);
                startActivity(intent);
            }
        });
        LinearLayout attract3 = (LinearLayout )findViewById(R.id.attract_3);
        attract3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract3.class);
                startActivity(intent);
            }
        });
        LinearLayout attract4 = (LinearLayout )findViewById(R.id.attract_4);
        attract4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract4.class);
                startActivity(intent);
            }
        });
        LinearLayout attract5 = (LinearLayout )findViewById(R.id.attract_5);
        attract5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract5.class);
                startActivity(intent);
            }
        });
        LinearLayout attract6 = (LinearLayout )findViewById(R.id.attract_6);
        attract6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract6.class);
                startActivity(intent);
            }
        });
        LinearLayout attract7 = (LinearLayout )findViewById(R.id.attract_7);
        attract7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract7.class);
                startActivity(intent);
            }
        });
        LinearLayout attract8 = (LinearLayout )findViewById(R.id.attract_8);
        attract8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract8.class);
                startActivity(intent);
            }
        });
        LinearLayout attract9 = (LinearLayout )findViewById(R.id.attract_9);
        attract9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LavraAll.this, Attract9.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(LavraAll.this, Dashboard.class);
        startActivity(intent);finish();
    }
}
