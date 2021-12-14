package com.example.tvfunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView visimisi, akreditasi, profillulusan, tujuan, sejarah, struktur, stafprodi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining Cards
        visimisi = (CardView) findViewById(R.id.visimisi);
        akreditasi = (CardView) findViewById(R.id.akreditasi);
        profillulusan = (CardView) findViewById(R.id.profil_lulusan);
        tujuan = (CardView) findViewById(R.id.tujuan);
        sejarah = (CardView) findViewById(R.id.sejarah);
        struktur = (CardView) findViewById(R.id.struktur);
        stafprodi = (CardView) findViewById(R.id.stafprodi);

        //add click listener to the cards
        visimisi.setOnClickListener(this);
        akreditasi.setOnClickListener(this);
        profillulusan.setOnClickListener(this);
        tujuan.setOnClickListener(this);
        sejarah.setOnClickListener(this);
        struktur.setOnClickListener(this);
        stafprodi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.visimisi:
                i = new Intent(this,VisiMisi.class);startActivity(i); break;
            case R.id.akreditasi:
                i = new Intent(this,Akreditasi.class);startActivity(i); break;
            case R.id.profil_lulusan:
                i = new Intent(this,ProfilLulusan.class);startActivity(i); break;
            /* case R.id.tujuan:
                i = new Intent(this,Tujuan.class);startActivity(i); break;
            case R.id.sejarah:
                i = new Intent(this,Sejarah.class);startActivity(i); break;
             */
            case R.id.struktur:
                i = new Intent(this,Struktur.class);startActivity(i); break;
            case R.id.stafprodi:
                i = new Intent(this,StafProdi.class);startActivity(i); break;
            default:break;
        }
    }
}