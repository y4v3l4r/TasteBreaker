package com.yarency.android.tastebreaker;

public class CategoryItem {
    String name;
    int image;

    public CategoryItem (String name, int image) {
        this.name = name;
        this.image = image;

    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
