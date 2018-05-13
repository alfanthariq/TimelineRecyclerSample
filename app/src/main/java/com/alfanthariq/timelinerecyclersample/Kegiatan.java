package com.alfanthariq.timelinerecyclersample;

/**
 * Created by alfanthariq on 12/05/2018.
 */

public class Kegiatan {
    String date_str, day, time_str, detail;

    public Kegiatan(String date_str, String day, String time_str, String detail){
        this.date_str = date_str;
        this.day = day;
        this.time_str = time_str;
        this.detail = detail;
    }

    public String getDate_str() {
        return date_str;
    }

    public String getDay() {
        return day;
    }

    public String getTime_str() {
        return time_str;
    }

    public String getDetail() {
        return detail;
    }
}
