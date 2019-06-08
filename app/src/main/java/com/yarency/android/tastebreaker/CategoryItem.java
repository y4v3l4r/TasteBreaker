package com.yarency.android.tastebreaker;

public class CategoryItem {
    String name;
    int image;
    int sample;

    public CategoryItem (String name, int image) {
        this.name = name;
        this.image = image;
    }

    public CategoryItem (String name, int image, int sample) {
        this.name = name;
        this.image = image;
        this.sample = sample;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getSample() { return sample;}
}
