package com.example.afi.aplikasimasakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMasakan extends AppCompatActivity {

    ImageView DetailGambar;
    TextView DetailDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_masakan);
        DetailGambar = (ImageView)findViewById(R.id.detailGambar);
        DetailDeskripsi = (TextView)findViewById(R.id.detailDeskripsi);

        Intent judulMasakan = getIntent();

        String DetailJudul = judulMasakan.getStringExtra("judul");
        getSupportActionBar().setTitle(DetailJudul);
        String DetailDeskripsi1 = judulMasakan.getStringExtra("deskripsi");
        DetailDeskripsi.setText(DetailDeskripsi1);
        int DetailGambar1 = judulMasakan.getIntExtra("gambar",0);
        DetailGambar.setImageResource(DetailGambar1);
    }
}
