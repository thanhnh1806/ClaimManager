package com.thanh.claimmanager.object;

import com.thanh.claimmanager.R;

import java.util.ArrayList;

/**
 * Created by thanh_nguyen02 on 14/12/2015.
 */
public class Work {
    private String name;
    private int imageResource;
    private String description;

    public Work(String name, int imageResource, String description) {
        this.name = name;
        this.imageResource = imageResource;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
