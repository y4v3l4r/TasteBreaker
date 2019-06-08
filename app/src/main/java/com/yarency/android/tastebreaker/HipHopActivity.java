package com.yarency.android.tastebreaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_hop);

        ArrayList<CategoryItem> HipHop = new ArrayList();
        HipHop.add(new CategoryItem("Dr. Dre", R.drawable.dre, R.raw.dre));
        HipHop.add(new CategoryItem("Snoop Dogg", R.drawable.dogg, R.raw.snoop));
        HipHop.add(new CategoryItem("Eminem", R.drawable.eminem, R.raw.eminem));
        HipHop.add(new CategoryItem("Logic", R.drawable.logic, R.raw.logic));
        HipHop.add(new CategoryItem("SOB x RBE", R.drawable.sob, R.raw.sob));
        HipHop.add(new CategoryItem("Kendrick Lamar", R.drawable.kendrick));
        HipHop.add(new CategoryItem("Ybn Nahmir", R.drawable.nahmir));
        HipHop.add(new CategoryItem("Biggie Smalls", R.drawable.big));
        HipHop.add(new CategoryItem("Ice Cube", R.drawable.cube));
        HipHop.add(new CategoryItem("Tupac", R.drawable.tupac));
        HipHop.add(new CategoryItem("J Cole", R.drawable.cole));



        CategoryAdapter adapter = new CategoryAdapter(this, HipHop);
        ListView listView = findViewById(R.id.HipHop_list);
        listView.setAdapter(adapter);
    }

}
