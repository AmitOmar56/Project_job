package com.lifeplaytrip.internshala_pro.model;

/**
 * Created by LifePlayTrip on 5/12/2018.
 */

public class Allinternship {
    private String job_name;
    private String company_name;
    private String location;
    private String start_date;
    private String duration;
    private String stipend;
    private String apply_by;
    private String time_periad;

    public Allinternship(String job_name, String company_name, String location, String start_date, String duration, String stipend, String apply_by, String time_periad) {
        this.job_name = job_name;
        this.company_name = company_name;
        this.location = location;
        this.start_date = start_date;
        this.duration = duration;
        this.stipend = stipend;
        this.apply_by = apply_by;
        this.time_periad = time_periad;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStipend() {
        return stipend;
    }

    public void setStipend(String stipend) {
        this.stipend = stipend;
    }

    public String getApply_by() {
        return apply_by;
    }

    public void setApply_by(String apply_by) {
        this.apply_by = apply_by;
    }

    public String getTime_periad() {
        return time_periad;
    }

    public void setTime_periad(String time_periad) {
        this.time_periad = time_periad;
    }
}
