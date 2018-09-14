package com.lucknut.tugas_recylerview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Novel_detail extends AppCompatActivity {
    private ImageView novelPoster;
    private TextView novelName, novelDesc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novel_detail);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        novelPoster = findViewById(R.id.NovelDetailImage);
        novelName = findViewById(R.id.NovelDetailName);
        novelDesc = findViewById(R.id.NovelDetailDesc);

        if (getIntent() != null){
            if(getIntent().hasExtra("novel")){
                Novel novel = getIntent().getParcelableExtra("novel");

                if(getSupportActionBar() != null){
                    getSupportActionBar().setTitle(novel.getName());
                }

                novelPoster.setImageResource(novel.getPoster());
                novelName.setText(novel.getName());
                novelDesc.setText(novel.getDescription());
            }
        }
    }
}
