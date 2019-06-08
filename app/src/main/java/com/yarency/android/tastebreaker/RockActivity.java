package com.yarency.android.tastebreaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        ArrayList<CategoryItem> Rock = new ArrayList();
        Rock.add(new CategoryItem("The Beatles", R.drawable.beatles, R.raw.standing));
        Rock.add(new CategoryItem("Sparks", R.drawable.sparks, R.raw.sparks));
        Rock.add(new CategoryItem("Electric Light Orchestra", R.drawable.elo, R.raw.bluesky));
        Rock.add(new CategoryItem("Queen", R.drawable.queen, R.raw.queen));
        Rock.add(new CategoryItem("Saint Motel", R.drawable.motel));
        Rock.add(new CategoryItem("Imagine Dragons", R.drawable.dragons));
        Rock.add(new CategoryItem("The Beach Boys", R.drawable.beach));
        Rock.add(new CategoryItem("Panic! At The Disco", R.drawable.disco));
        Rock.add(new CategoryItem("Muse", R.drawable.muse));
        Rock.add(new CategoryItem("Twenty One Pilots", R.drawable.pilots));


        CategoryAdapter adapter = new CategoryAdapter(this, Rock);
        ListView listView = findViewById(R.id.Rock_list);
        listView.setAdapter(adapter);
    }
}
