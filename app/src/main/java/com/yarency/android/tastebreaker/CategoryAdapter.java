package com.yarency.android.tastebreaker;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CategoryAdapter extends ArrayAdapter<CategoryItem> {

    Context context;
    MediaPlayer mediaPlayer;

    public CategoryAdapter(Context context, ArrayList<CategoryItem> list) {
        super(context, 0, list);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_category_list_item, parent, false);
        final CategoryItem currentCategoryItem = getItem(position);
        ImageView categoryImageView = convertView.findViewById(R.id.ImageView);
        categoryImageView.setImageResource(currentCategoryItem.getImage());
        TextView categoryTextView = convertView.findViewById(R.id.TextView);
        categoryTextView.setText(currentCategoryItem.getName());

        Button sampleButton = convertView.findViewById(R.id.MusicSample);
        sampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(context,currentCategoryItem.getSample() );
                mediaPlayer.start();
            }
        });

        Button stop = convertView.findViewById(R.id.stopMusic);
        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
            }
        });

        return convertView;
    }


}
