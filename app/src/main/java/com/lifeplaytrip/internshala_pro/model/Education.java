package com.lifeplaytrip.internshala_pro.model;

/**
 * Created by LifePlayTrip on 5/1/2018.
 */

public class Education {
    private String education_name;
    private String education_course;
    private String education_start_time;
    private String education_end_time;
    private String education_discription;
    private int education_id;

    public Education(String education_name, String education_course, String education_start_time, String education_end_time, String education_discription, int education_id) {
    this.education_course=education_course;
    this.education_discription=education_discription;
    this.education_name=education_name;
    this.education_start_time=education_start_time;
    this.education_end_time=education_end_time;
    this.education_id=education_id;
    }

    public String getEducation_name() {
        return education_name;
    }

    public void setEducation_name(String education_name) {
        this.education_name = education_name;
    }

    public String getEducation_course() {
        return education_course;
    }

    public void setEducation_course(String education_course) {
        this.education_course = education_course;
    }

    public String getEducation_start_time() {
        return education_start_time;
    }

    public void setEducation_start_time(String education_start_time) {
        this.education_start_time = education_start_time;
    }

    public String getEducation_end_time() {
        return education_end_time;
    }

    public void setEducation_end_time(String education_end_time) {
        this.education_end_time = education_end_time;
    }

    public String getEducation_discription() {
        return education_discription;
    }

    public void setEducation_discription(String education_discription) {
        this.education_discription = education_discription;
    }

    public int getEducation_id() {
        return education_id;
    }

    public void setEducation_id(int education_id) {
        this.education_id = education_id;
    }
}
