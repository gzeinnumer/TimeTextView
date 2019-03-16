package com.gzeinnumer.timetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gzeinnumer.timetextview.R;

import morxander.zaman.ZamanTextView;

public class MainActivity extends AppCompatActivity {

    ZamanTextView ztvNow, ztvHour, ztvDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ztvDay = findViewById(R.id.ztvDay);
        ztvHour = findViewById(R.id.ztvHour);
        ztvNow = findViewById(R.id.ztvNow);

        ztvNow.setTimeStamp(868482087);
        ztvHour.setTimeStamp(868485687);
        ztvDay.setTimeStamp(868568487);
    }
}
