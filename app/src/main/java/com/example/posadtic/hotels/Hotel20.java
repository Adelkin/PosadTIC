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

public class Hotel20 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_20);

        //Сделать ссылку на карту кликабельным
        TextView linkToSite = findViewById(R.id.link_hotel20);
        linkToSite.setMovementMethod(LinkMovementMethod.getInstance());

        //Сделать ссылку на сайт кликабельным
        TextView linkToMap = findViewById(R.id.hotel_map_link20);
        linkToMap.setMovementMethod(LinkMovementMethod.getInstance());
    }
    //кнопка на букинг
    public void linkButton (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.booking.com/hotel/ru/otel-kovcheg-sergiev-posad.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaMIBiAEBmAEhuAEIyAEM2AEB6AEB-AELiAIBqAID2AIC&sid=132d2def4de77556abfa9ebac88632a6&dest_id=-2999269&dest_type=city&group_adults=2&group_children=0&hapos=21&hpos=21&nflt=ht_id%3D204%3B&no_rooms=1&sr_order=popularity&srepoch=1616063009&srpvid=1a9949109d440047&ucfs=1&from=searchresults;highlight_room=#hotelTmpl"));
        startActivity(intent);
    }
    //кликабельный номер телефона
    public void dial(View v) {
        TextView number=(TextView)findViewById(R.id.phone_number_hotel20);
        String toDial="tel:"+number.getText().toString();
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));
    }


}
