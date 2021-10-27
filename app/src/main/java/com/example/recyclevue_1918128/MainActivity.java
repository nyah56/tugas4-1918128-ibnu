package com.example.recyclevue_1918128;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ContentAdapter adapter;
    private ArrayList<Content> ctnArrayList;
    private ArrayList<Content> ctArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView) findViewById(R.id.recycleview);
        adapter = new ContentAdapter(ctnArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        ctnArrayList = new ArrayList<>();
        ctnArrayList.add(new Content("Kocheng Ngeleg", "Never",
                "20:12",R.drawable.crop));
        ctnArrayList.add(new Content("Cooler Pineapple", "Gonna",
                "20:11",R.drawable.nanas));
        ctnArrayList.add(new Content("Rick Astley", "Give You Up",
                "20:10",R.drawable.rick));
    }


}

