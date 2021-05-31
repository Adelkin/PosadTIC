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

public class ApartmentsAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apartments_all);

        CardView button1 = (CardView) findViewById(R.id.hotels_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, HotelView.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.hostels_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, HostelsAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.guesthouses_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, GuesthousesAll.class);
                startActivity(intent);
            }
        });
        /// отели ///
        LinearLayout hotel24 = (LinearLayout )findViewById(R.id.hotel_24);
        hotel24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel24.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel25 = (LinearLayout )findViewById(R.id.hotel_25);
        hotel25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel25.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel26 = (LinearLayout )findViewById(R.id.hotel_26);
        hotel26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel26.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel27 = (LinearLayout )findViewById(R.id.hotel_27);
        hotel27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel27.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel28 = (LinearLayout )findViewById(R.id.hotel_28);
        hotel28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel28.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel29 = (LinearLayout )findViewById(R.id.hotel_29);
        hotel29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel29.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel30 = (LinearLayout )findViewById(R.id.hotel_30);
        hotel30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel30.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel31 = (LinearLayout )findViewById(R.id.hotel_31);
        hotel31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel31.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel32 = (LinearLayout )findViewById(R.id.hotel_32);
        hotel32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel32.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel33 = (LinearLayout )findViewById(R.id.hotel_33);
        hotel33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ApartmentsAll.this, Hotel33.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(ApartmentsAll.this, Dashboard.class);
        startActivity(intent);finish();
    }
}
