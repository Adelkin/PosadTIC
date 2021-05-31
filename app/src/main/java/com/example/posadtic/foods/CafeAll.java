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

public class CafeAll extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_all);


        /// Кнопки сверху /////////
        CardView button1 = (CardView) findViewById(R.id.restaurants_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CafeAll.this, FoodView.class);
                startActivity(intent);
            }
        });

        CardView button2 = (CardView) findViewById(R.id.bars_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CafeAll.this, BarsAll.class);
                startActivity(intent);
            }
        });

        /////// Кнопки на рестораны //////
        LinearLayout food3 = (LinearLayout )findViewById(R.id.food_3);
        food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CafeAll.this, Food3.class);
                startActivity(intent);
            }
        });
        LinearLayout food4 = (LinearLayout )findViewById(R.id.food_4);
        food4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CafeAll.this, Food4.class);
                startActivity(intent);
            }
        });
        LinearLayout food17 = (LinearLayout )findViewById(R.id.food_17);
        food17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CafeAll.this, Food17.class);
                startActivity(intent);
            }
        });
        LinearLayout food30 = (LinearLayout )findViewById(R.id.food_30);
        food30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CafeAll.this, Food30.class);
                startActivity(intent);
            }
        });
        LinearLayout food31 = (LinearLayout )findViewById(R.id.food_31);
        food31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CafeAll.this, Food31.class);
                startActivity(intent);
            }
        });
    }
}
