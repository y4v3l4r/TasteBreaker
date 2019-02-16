package com.yarency.android.tastebreaker;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LofiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lofi);

        ArrayList<CategoryItem> Lofi = new ArrayList();
        Lofi.add(new CategoryItem("Tomppabeats", R.drawable.tomppab));
        Lofi.add(new CategoryItem("The Deli", R.drawable.delii));
        Lofi.add(new CategoryItem("Elijah Who", R.drawable.whoo));
        Lofi.add(new CategoryItem("Jinsang", R.drawable.sang));
        Lofi.add(new CategoryItem("Rook1e", R.drawable.rook1ee));
        Lofi.add(new CategoryItem("Potsu", R.drawable.potsuu));
        Lofi.add(new CategoryItem("Eevee", R.drawable.eevee));
        Lofi.add(new CategoryItem("Prima", R.drawable.primaa));
        Lofi.add(new CategoryItem("Wu Two", R.drawable.wutwo));
        Lofi.add(new CategoryItem("Kudasai", R.drawable.kudasai));


       CategoryAdapter adapter = new CategoryAdapter(this, Lofi);
        ListView listView = findViewById(R.id.Lofi_list);
        listView.setAdapter(adapter);

       // Log.d("LofiActivity", "Lofi Music " + Lofi[0]);

    }
}
