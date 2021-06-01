package com.example.posadtic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Tic extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tic);

        //Сделать ссылку на карту кликабельным
        TextView linkToMap = findViewById(R.id.tic_map_link);
        linkToMap.setMovementMethod(LinkMovementMethod.getInstance());

    }

    //кликабельный номер телефона
    public void dial(View v) {
        TextView number=(TextView)findViewById(R.id.tic_phone_number);
        String toDial="tel:"+number.getText().toString();
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));
    }


}
