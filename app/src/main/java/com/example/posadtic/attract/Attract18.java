package com.example.posadtic.attract;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.posadtic.R;

public class Attract18 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_18);

        //Сделать ссылку на карту кликабельным
        TextView linkToMap = findViewById(R.id.attract_18_map_link);
        linkToMap.setMovementMethod(LinkMovementMethod.getInstance());

        ////Сделать ссылку на сайт кликабельным
        //TextView linkTextView = findViewById(R.id.attract_17_link);
        //linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    //кликабельный номер телефона
    //public void dial(View v) {
    //    TextView number=(TextView)findViewById(R.id.attract_17_phone_number);
    //    String toDial="tel:"+number.getText().toString();
    //    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));
    //}


}
