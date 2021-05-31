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
import com.example.posadtic.hotels.Hotel1;
import com.example.posadtic.hotels.HotelView;

public class FoodView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_view);


        CardView button2 = (CardView) findViewById(R.id.cafe_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, CafeAll.class);
                startActivity(intent);
            }
        });
        CardView button3 = (CardView) findViewById(R.id.bars_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, BarsAll.class);
                startActivity(intent);
            }
        });

        /////// Кнопки на рестораны //////
        LinearLayout food1 = (LinearLayout )findViewById(R.id.food_1);
        food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food1.class);
                startActivity(intent);
            }
        });
        LinearLayout food2 = (LinearLayout )findViewById(R.id.food_2);
        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food2.class);
                startActivity(intent);
            }
        });
        LinearLayout food5 = (LinearLayout )findViewById(R.id.food_5);
        food5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food5.class);
                startActivity(intent);
            }
        });
        LinearLayout food6 = (LinearLayout )findViewById(R.id.food_6);
        food6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food6.class);
                startActivity(intent);
            }
        });
        LinearLayout food7 = (LinearLayout )findViewById(R.id.food_7);
        food7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food7.class);
                startActivity(intent);
            }
        });
        LinearLayout food8 = (LinearLayout )findViewById(R.id.food_8);
        food8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food8.class);
                startActivity(intent);
            }
        });
        LinearLayout food9 = (LinearLayout )findViewById(R.id.food_9);
        food9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food1.class);
                startActivity(intent);
            }
        });
        LinearLayout food10 = (LinearLayout )findViewById(R.id.food_10);
        food10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food10.class);
                startActivity(intent);
            }
        });
        LinearLayout food11 = (LinearLayout )findViewById(R.id.food_11);
        food11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food11.class);
                startActivity(intent);
            }
        });
        LinearLayout food12 = (LinearLayout )findViewById(R.id.food_12);
        food12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food12.class);
                startActivity(intent);
            }
        });
        LinearLayout food13 = (LinearLayout )findViewById(R.id.food_13);
        food13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food13.class);
                startActivity(intent);
            }
        });
        LinearLayout food14 = (LinearLayout )findViewById(R.id.food_14);
        food14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food14.class);
                startActivity(intent);
            }
        });
        LinearLayout food15 = (LinearLayout )findViewById(R.id.food_15);
        food15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food15.class);
                startActivity(intent);
            }
        });
        LinearLayout food18 = (LinearLayout )findViewById(R.id.food_18);
        food18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food18.class);
                startActivity(intent);
            }
        });
        LinearLayout food19 = (LinearLayout )findViewById(R.id.food_19);
        food19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food19.class);
                startActivity(intent);
            }
        });
        LinearLayout food20 = (LinearLayout )findViewById(R.id.food_20);
        food20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food20.class);
                startActivity(intent);
            }
        });
        LinearLayout food21 = (LinearLayout )findViewById(R.id.food_21);
        food21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food21.class);
                startActivity(intent);
            }
        });
        LinearLayout food22 = (LinearLayout )findViewById(R.id.food_22);
        food22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food22.class);
                startActivity(intent);
            }
        });
        LinearLayout food23 = (LinearLayout )findViewById(R.id.food_23);
        food23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food23.class);
                startActivity(intent);
            }
        });
        LinearLayout food25 = (LinearLayout )findViewById(R.id.food_25);
        food25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food25.class);
                startActivity(intent);
            }
        });
        LinearLayout food26 = (LinearLayout )findViewById(R.id.food_26);
        food26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodView.this, Food26.class);
                startActivity(intent);
            }
        });
    }
}
