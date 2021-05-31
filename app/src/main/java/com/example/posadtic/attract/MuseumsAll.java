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
import com.example.posadtic.hotels.Hotel34;
import com.example.posadtic.hotels.Hotel35;
import com.example.posadtic.hotels.Hotel36;
import com.example.posadtic.hotels.Hotel37;
import com.example.posadtic.hotels.Hotel38;
import com.example.posadtic.hotels.Hotel39;
import com.example.posadtic.hotels.Hotel40;
import com.example.posadtic.hotels.HotelView;

public class MuseumsAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museams_all);

        CardView button1 = (CardView) findViewById(R.id.lavra_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumsAll.this, LavraAll.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.religions_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumsAll.this, ReligionsAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.walk_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumsAll.this, WalksAll.class);
                startActivity(intent);
            }
        });

        /// музеи ////
        LinearLayout attract13 = (LinearLayout )findViewById(R.id.attract_13);
        attract13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumsAll.this, Attract13.class);
                startActivity(intent);
            }
        });
        LinearLayout attract14 = (LinearLayout )findViewById(R.id.attract_14);
        attract14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumsAll.this, Attract14.class);
                startActivity(intent);
            }
        });
        LinearLayout attract15 = (LinearLayout )findViewById(R.id.attract_15);
        attract15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumsAll.this, Attract15.class);
                startActivity(intent);
            }
        });
        LinearLayout attract16 = (LinearLayout )findViewById(R.id.attract_16);
        attract16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumsAll.this, Attract16.class);
                startActivity(intent);
            }
        });
        LinearLayout attract17 = (LinearLayout )findViewById(R.id.attract_17);
        attract17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MuseumsAll.this, Attract17.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(MuseumsAll.this, Dashboard.class);
        startActivity(intent);finish();
    }
}
