package com.yarency.android.tastebreaker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<CategoryItem> {
    public CategoryAdapter(Context context, ArrayList<CategoryItem> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_category_list_item, parent, false);
        CategoryItem currentCategoryItem = getItem(position);
        ImageView categoryImageView = convertView.findViewById(R.id.ImageView);
        categoryImageView.setImageResource(currentCategoryItem.getImage());
        TextView categoryTextView = convertView.findViewById(R.id.TextView);
        categoryTextView.setText(currentCategoryItem.getName());

        return convertView;
    }
}
