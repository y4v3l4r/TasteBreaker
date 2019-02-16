package com.yarency.android.tastebreaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class OldiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldies);


        ArrayList<CategoryItem> Oldies = new ArrayList();
        Oldies.add(new CategoryItem("The Platters", R.drawable.platters));
        Oldies.add(new CategoryItem("The 5 Satins", R.drawable.satins));
        Oldies.add(new CategoryItem("The Ronettes", R.drawable.ronettes));
        Oldies.add(new CategoryItem("Paul Anka", R.drawable.anka));
        Oldies.add(new CategoryItem("Connie Francis", R.drawable.connie));
        Oldies.add(new CategoryItem("The Eglins", R.drawable.elgins));
        Oldies.add(new CategoryItem("The Shirelles", R.drawable.shirelles));
        Oldies.add(new CategoryItem("Doris Day", R.drawable.day));
        Oldies.add(new CategoryItem("Johnny Mathis", R.drawable.mathis));




        CategoryAdapter adapter = new CategoryAdapter(this, Oldies);
        ListView listView = findViewById(R.id.Oldies_list);
        listView.setAdapter(adapter);
    }
}
