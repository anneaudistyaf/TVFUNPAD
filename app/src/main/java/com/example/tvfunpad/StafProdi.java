package com.example.tvfunpad;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class StafProdi extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;
    RecyclerView recyclerView;
    String s1[];
    int images[]={R.drawable.dosen1, R.drawable.dosen2, R.drawable.dosen3, R.drawable.dosen4, R.drawable.dosen5, R.drawable.dosen6, R.drawable.dosen7, R.drawable.dosen8, R.drawable.dosen9, R.drawable.dosen10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staf_prodi);
        toolbar = findViewById(R.id.toolbar2);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar2_text);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.namadosen);

        MyAdapter myAdapter = new MyAdapter(this, s1, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}