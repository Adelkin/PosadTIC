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

public class HotelView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_view);

        CardView button1 = (CardView) findViewById(R.id.apartments_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, ApartmentsAll.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.hostels_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, HostelsAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.guesthouses_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, GuesthousesAll.class);
                startActivity(intent);
            }
        });

        /////// Кнопки на отели //////
        LinearLayout hotel1 = (LinearLayout )findViewById(R.id.hotel_1);
        hotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel1.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel2 = (LinearLayout )findViewById(R.id.hotel_2);
        hotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel2.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel3 = (LinearLayout )findViewById(R.id.hotel_3);
        hotel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel3.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel4 = (LinearLayout )findViewById(R.id.hotel_4);
        hotel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel4.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel5 = (LinearLayout )findViewById(R.id.hotel_5);
        hotel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel5.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel6 = (LinearLayout )findViewById(R.id.hotel_6);
        hotel6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel6.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel7 = (LinearLayout )findViewById(R.id.hotel_7);
        hotel7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel7.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel8 = (LinearLayout )findViewById(R.id.hotel_8);
        hotel8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel8.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel9 = (LinearLayout )findViewById(R.id.hotel_9);
        hotel9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel9.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel10 = (LinearLayout )findViewById(R.id.hotel_10);
        hotel10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel10.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel11 = (LinearLayout )findViewById(R.id.hotel_11);
        hotel11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel11.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel12 = (LinearLayout )findViewById(R.id.hotel_12);
        hotel12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel12.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel13 = (LinearLayout )findViewById(R.id.hotel_13);
        hotel13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel13.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel14 = (LinearLayout )findViewById(R.id.hotel_14);
        hotel14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel14.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel15 = (LinearLayout )findViewById(R.id.hotel_15);
        hotel15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel15.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel16 = (LinearLayout )findViewById(R.id.hotel_16);
        hotel16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel16.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel17 = (LinearLayout )findViewById(R.id.hotel_17);
        hotel17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel17.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel18 = (LinearLayout )findViewById(R.id.hotel_18);
        hotel18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel18.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel19 = (LinearLayout )findViewById(R.id.hotel_19);
        hotel19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel19.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel20 = (LinearLayout )findViewById(R.id.hotel_20);
        hotel20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel20.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel21 = (LinearLayout )findViewById(R.id.hotel_21);
        hotel21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel21.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel22 = (LinearLayout )findViewById(R.id.hotel_22);
        hotel22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel22.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel23 = (LinearLayout )findViewById(R.id.hotel_23);
        hotel23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelView.this, Hotel23.class);
                startActivity(intent);
            }
        });
    }
    //кнопка назад
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(HotelView.this, Dashboard.class);
        startActivity(intent);finish();
    }


}
