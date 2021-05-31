package com.example.posadtic.hotels;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.posadtic.R;

public class Hotel35 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_35);

        //Сделать ссылку на карту кликабельным
        TextView linkToSite = findViewById(R.id.link_hotel35);
        linkToSite.setMovementMethod(LinkMovementMethod.getInstance());

    }
    //кнопка на букинг
    public void linkButton (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/ru/hostels-rus-prospekt-krasnoy-armii.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaMIBiAEBmAEhuAEIyAEM2AEB6AEB-AELiAIBqAID2AIC&sid=132d2def4de77556abfa9ebac88632a6&dest_id=-2999269&dest_type=city&group_adults=2&group_children=0&hapos=2&hpos=2&nflt=ht_id%3D203%3B&no_rooms=1&sr_order=popularity&srepoch=1616140273&srpvid=35803738d14b0132&ucfs=1&from=searchresults;highlight_room=#hotelTmpl"));
        startActivity(intent);
    }


}
