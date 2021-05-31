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
import com.example.posadtic.hotels.GuesthousesAll;

public class WalksAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walk_all);

        CardView button1 = (CardView) findViewById(R.id.museums_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksAll.this, MuseumsAll.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.lavra_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksAll.this, LavraAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.walk_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksAll.this, ReligionsAll.class);
                startActivity(intent);
            }
        });

        /// Лавра ////
        LinearLayout attract18 = (LinearLayout )findViewById(R.id.attract_18);
        attract18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksAll.this, Attract18.class);
                startActivity(intent);
            }
        });
        LinearLayout attract19 = (LinearLayout )findViewById(R.id.attract_19);
        attract19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksAll.this, Attract19.class);
                startActivity(intent);
            }
        });
        LinearLayout attract20 = (LinearLayout )findViewById(R.id.attract_20);
        attract20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksAll.this, Attract20.class);
                startActivity(intent);
            }
        });
        LinearLayout attract21 = (LinearLayout )findViewById(R.id.attract_21);
        attract21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksAll.this, Attract21.class);
                startActivity(intent);
            }
        });
        LinearLayout attract22 = (LinearLayout )findViewById(R.id.attract_22);
        attract22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksAll.this, Attract22.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(WalksAll.this, Dashboard.class);
        startActivity(intent);finish();
    }
}
