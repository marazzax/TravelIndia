package com.example.travelindia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.travelindia.adapter.RecentsAdapter;
import com.example.travelindia.adapter.TopPlacesAdapter;
import com.example.travelindia.model.RecentsData;
import com.example.travelindia.model.TopPlacesData;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dummy data for our model class
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Taj Mahal","India","From $500",R.drawable.taj_mahal_in_india));
        recentsDataList.add(new RecentsData("Udaipur Lake","India","From $500",R.drawable.udaipur_lake));
        recentsDataList.add(new RecentsData("Vanaras Ghat","India","From $500",R.drawable.varanasi_ghat));
        recentsDataList.add(new RecentsData("India Gate","India","From $500",R.drawable.india_gate));
        recentsDataList.add(new RecentsData("Golconda Fort","India","From $500",R.drawable.golconda_fort));
        recentsDataList.add(new RecentsData("Golden temple","India","From $500",R.drawable.golden_temple));
        recentsDataList.add(new RecentsData("Victoria Memorial","India","From $500",R.drawable.victoria_memorial_kolkata));

        setRecentRecycler(recentsDataList);


        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chowmahalla Palace","India","$75 - $150",R.drawable.chowmahalla_palace));
        topPlacesDataList.add(new TopPlacesData("Charminar","India","$50 - $75",R.drawable.charminar));
        topPlacesDataList.add(new TopPlacesData("Golconda Fort","India","$100 - $200",R.drawable.golconda_fort));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Victoria Memorial","India","From $500",R.drawable.victoria_memorial_kolkata));
        topPlacesDataList.add(new TopPlacesData("AM Lake","India","From $200",R.drawable.recentimage1));
        topPlacesDataList.add(new TopPlacesData("Taj Mahal","India","From $500",R.drawable.taj_mahal_in_india));
        topPlacesDataList.add(new TopPlacesData("Vanaras Ghat","India","From $500",R.drawable.varanasi_ghat));
        topPlacesDataList.add(new TopPlacesData("Golden temple","India","From $500",R.drawable.golden_temple));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler =findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
}
