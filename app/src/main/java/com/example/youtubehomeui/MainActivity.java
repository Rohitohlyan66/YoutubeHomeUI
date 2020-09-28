package com.example.youtubehomeui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    List<Data> list;
    ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recycler_view);
        search=findViewById(R.id.search);
        setSupportActionBar(toolbar);
        getSupportActionBar();


        //Search Icon Click------------------------------------------------>
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SearchActivity.class));
            }
        });



        //Setting Recycler View-------------------------------------------->
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new RecyclerAdapter(list, this);

        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));
        list.add(new Data(R.drawable.thumbnail, "12:30", R.drawable.profile_picture, "Text Input Layout in Android | Android Tutorials", "Code2Develop", "120k views", "3 minutes ago"));


        recyclerView.setAdapter(adapter);
    }
}