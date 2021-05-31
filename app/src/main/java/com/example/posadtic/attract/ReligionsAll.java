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

public class ReligionsAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.religion_all);

        CardView button1 = (CardView) findViewById(R.id.museums_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligionsAll.this, MuseumsAll.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.lavra_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligionsAll.this, LavraAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.walk_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligionsAll.this, WalksAll.class);
                startActivity(intent);
            }
        });

        /// Лавра ////
        LinearLayout attract10 = (LinearLayout )findViewById(R.id.attract_10);
        attract10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligionsAll.this, Attract10.class);
                startActivity(intent);
            }
        });
        LinearLayout attract11 = (LinearLayout )findViewById(R.id.attract_11);
        attract11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligionsAll.this, Attract11.class);
                startActivity(intent);
            }
        });
        LinearLayout attract12 = (LinearLayout )findViewById(R.id.attract_12);
        attract12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReligionsAll.this, Attract12.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(ReligionsAll.this, Dashboard.class);
        startActivity(intent);finish();
    }
}
