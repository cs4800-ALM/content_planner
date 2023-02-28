package com.example.content_planner;

//public record ContentPlanner(long id, String content) { }
public class ContentPlanner {

    private String title;
    private String date;

    public String getTitle() {
        return title;
    }
    public void setTitle(String fname) {
        this.title = fname;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String lname) {
        this.date = lname;
    }

    @Override
    public String toString() {
        return "ContentPlaner [title=" + title + ", date=" + date + "]";
    }


}


