package com.alfanthariq.timelinerecyclersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alfanthariq.timelinerecyclersample.adapter.TimelineAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView timelineRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timelineRecycler = findViewById(R.id.timeline);
        timelineRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        KegiatanSource kegiatanSource = new KegiatanSource();
        List<Kegiatan> kegiatanList = kegiatanSource.getList();
        timelineRecycler.setAdapter(new TimelineAdapter(this, kegiatanList));
    }
}
