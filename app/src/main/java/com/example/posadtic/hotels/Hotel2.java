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

public class Hotel2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_2);

        //Сделать ссылку на карту кликабельным
        TextView linkToMap = findViewById(R.id.link_hotel2);
        linkToMap.setMovementMethod(LinkMovementMethod.getInstance());

        //Сделать ссылку на сайт кликабельным
        TextView linkTextView = findViewById(R.id.hotel_2_link);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    //кнопка на букинг
    public void linkButton (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/ru/gosudarev-dom.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaMIBiAEBmAEhuAEIyAEM2AEB6AEB-AELiAIBqAID2AIC&sid=132d2def4de77556abfa9ebac88632a6&dest_id=-2999269&dest_type=city&group_adults=2&group_children=0&hapos=1&hpos=1&nflt=ht_id%3D204%3B&no_rooms=1&sr_order=popularity&srepoch=1615792362&srpvid=cd2e32b59f0e00cf&ucfs=1&from=searchresults;highlight_room=#availability"));
        startActivity(intent);
    }
    //кликабельный номер телефона
    public void dial(View v) {
        TextView number=(TextView)findViewById(R.id.phone_number_hotel2);
        String toDial="tel:"+number.getText().toString();
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));
    }


}
