package com.example.posadtic.foods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.posadtic.R;
import com.example.posadtic.hotels.ApartmentsAll;

public class BarsAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bars_all);


        /// Кнопки сверху /////////
        CardView button1 = (CardView) findViewById(R.id.restaurants_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BarsAll.this, FoodView.class);
                startActivity(intent);
            }
        });
        CardView button2 = (CardView) findViewById(R.id.cafe_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BarsAll.this, CafeAll.class);
                startActivity(intent);
            }
        });

        /////// Кнопки на рестораны //////
        LinearLayout food11 = (LinearLayout )findViewById(R.id.food_11);
        food11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BarsAll.this, Food11.class);
                startActivity(intent);
            }
        });
        LinearLayout food32 = (LinearLayout )findViewById(R.id.food_32);
        food32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BarsAll.this, Food32.class);
                startActivity(intent);
            }
        });
    }
}
