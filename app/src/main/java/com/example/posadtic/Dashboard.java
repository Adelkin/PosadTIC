package com.example.posadtic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.example.posadtic.attract.Attract18;
import com.example.posadtic.attract.Attract21;
import com.example.posadtic.attract.LavraAll;
import com.example.posadtic.attract.MuseumsAll;
import com.example.posadtic.foods.Food1;
import com.example.posadtic.foods.Food2;
import com.example.posadtic.foods.Food3;
import com.example.posadtic.foods.Food4;
import com.example.posadtic.foods.Food5;
import com.example.posadtic.foods.FoodView;
import com.example.posadtic.hotels.Hotel1;
import com.example.posadtic.hotels.Hotel2;
import com.example.posadtic.hotels.Hotel3;
import com.example.posadtic.hotels.Hotel4;
import com.example.posadtic.hotels.Hotel5;
import com.example.posadtic.hotels.HotelView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //тута кнопка на see more 1
        LinearLayout see_more_1 = (LinearLayout )findViewById(R.id.see_more_1);
        see_more_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(Dashboard.this, MuseumsAll.class);
                startActivity(picture_intent);
            }
        });
        //тута кнопка на see more 2
        LinearLayout menu_photos = (LinearLayout )findViewById(R.id.see_more_2);
        menu_photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(Dashboard.this, HotelView.class);
                startActivity(picture_intent);
            }
        });
        //тута кнопка на see more 3
        LinearLayout see_more_3 = (LinearLayout )findViewById(R.id.see_more_3);
        see_more_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent picture_intent = new Intent(Dashboard.this, FoodView.class);
                startActivity(picture_intent);
            }
        });

        // кнопка на события
        LinearLayout events = (LinearLayout )findViewById(R.id.events_button);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Events.class);
                startActivity(intent);
            }
        });
        // кнопка на погоду
        LinearLayout weather = (LinearLayout )findViewById(R.id.weather_button);
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Weather.class);
                startActivity(intent);
            }
        });

        // Кнопки на Attractions
        LinearLayout attract0 = (LinearLayout )findViewById(R.id.attract_0);
        attract0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, LavraAll.class);
                startActivity(intent);
            }
        });

        LinearLayout attract18 = (LinearLayout )findViewById(R.id.attract_dashboard_2);
        attract18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Attract18.class);
                startActivity(intent);
            }
        });
        LinearLayout attract21 = (LinearLayout )findViewById(R.id.attract_dashboard_3);
        attract21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Attract21.class);
                startActivity(intent);
            }
        });


        ////// кнопки отелей ////////////////
        LinearLayout hotel1 = (LinearLayout )findViewById(R.id.hotel_1);
        hotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Hotel1.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel2 = (LinearLayout )findViewById(R.id.hotel_2);
        hotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Hotel2.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel3 = (LinearLayout )findViewById(R.id.hotel_3);
        hotel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Hotel3.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel4 = (LinearLayout )findViewById(R.id.hotel_4);
        hotel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Hotel4.class);
                startActivity(intent);
            }
        });
        LinearLayout hotel5 = (LinearLayout )findViewById(R.id.hotel_5);
        hotel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Hotel5.class);
                startActivity(intent);
            }
        });

        ////////// кнопки food ///////////
        LinearLayout food1 = (LinearLayout )findViewById(R.id.food_1);
        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Food1.class);
                startActivity(intent);
            }
        });
        LinearLayout food2 = (LinearLayout )findViewById(R.id.food_2);
        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Food2.class);
                startActivity(intent);
            }
        });
        LinearLayout food3 = (LinearLayout )findViewById(R.id.food_3);
        food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Food3.class);
                startActivity(intent);
            }
        });
        LinearLayout food4 = (LinearLayout )findViewById(R.id.food_4);
        food4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Food4.class);
                startActivity(intent);
            }
        });
        LinearLayout food5 = (LinearLayout )findViewById(R.id.food_5);
        food5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Food5.class);
                startActivity(intent);
            }
        });
    }
}