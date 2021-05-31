package com.example.posadtic.hotels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.posadtic.Dashboard;
import com.example.posadtic.R;

public class HostelsAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hostels_all);

        CardView button1 = (CardView) findViewById(R.id.hotels_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, HotelView.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.apartments_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, ApartmentsAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.guesthouses_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, GuesthousesAll.class);
                startActivity(intent);
            }
        });

        /// отели ////
        LinearLayout hotel34 = (LinearLayout )findViewById(R.id.hotel_34);
        hotel34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, Hotel34.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel35 = (LinearLayout )findViewById(R.id.hotel_35);
        hotel35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, Hotel35.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel36 = (LinearLayout )findViewById(R.id.hotel_36);
        hotel36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, Hotel36.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel37 = (LinearLayout )findViewById(R.id.hotel_37);
        hotel37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, Hotel37.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel38 = (LinearLayout )findViewById(R.id.hotel_38);
        hotel38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, Hotel38.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel39 = (LinearLayout )findViewById(R.id.hotel_39);
        hotel39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, Hotel39.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel40 = (LinearLayout )findViewById(R.id.hotel_40);
        hotel40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HostelsAll.this, Hotel40.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(HostelsAll.this, Dashboard.class);
        startActivity(intent);finish();
    }
}
