package com.example.ibadahkuy;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView ivNama;
    private TextView tvLatitude;
    private TextView tvLongitude;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_tempat);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(getIntent().getStringExtra("jenis"));
        ivNama.setText("Nama : " + getIntent().getStringExtra("nama"));
        tvLatitude.setText("Latitude : " + getIntent().getStringExtra("latitude"));
        tvLongitude.setText("Longitude : " + getIntent().getStringExtra( "longitude"));

    }

    private void initView() {
        ivNama = findViewById(R.id.iv_nama);
        tvLatitude = findViewById(R.id.tv_latitude);
        tvLongitude = findViewById(R.id.tv_longitude);
    }
}