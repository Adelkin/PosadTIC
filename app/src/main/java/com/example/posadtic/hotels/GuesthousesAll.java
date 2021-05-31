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

public class GuesthousesAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guesthouses_all);

        CardView button1 = (CardView) findViewById(R.id.hotels_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuesthousesAll.this, HotelView.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.apartments_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuesthousesAll.this, ApartmentsAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.hostels_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuesthousesAll.this, HostelsAll.class);
                startActivity(intent);
            }
        });

        /// отели ///

        LinearLayout hotel41 = (LinearLayout )findViewById(R.id.hotel_41);
        hotel41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuesthousesAll.this, Hotel41.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel42 = (LinearLayout )findViewById(R.id.hotel_42);
        hotel42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuesthousesAll.this, Hotel42.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel43 = (LinearLayout )findViewById(R.id.hotel_43);
        hotel43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuesthousesAll.this, Hotel43.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(GuesthousesAll.this, Dashboard.class);
        startActivity(intent);finish();
    }
}
