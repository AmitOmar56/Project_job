package com.lifeplaytrip.internshala_pro.model;

/**
 * Created by LifePlayTrip on 5/11/2018.
 */

public class City {
    private String city_name;
    private int city_id;
    private String city_image;

    public City(String city_name, String city_image, int city_id) {
        this.city_name = city_name;
        this.city_id = city_id;
        this.city_image = city_image;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_image() {
        return city_image;
    }

    public void setCity_image(String city_image) {
        this.city_image = city_image;
    }
}
