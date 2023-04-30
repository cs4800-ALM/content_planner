package com.example.content_planner.model;

// similar to ContentPlanner - this will replace contentPlanner

        import jakarta.persistence.*;

        import java.io.Serializable;

// Replacing ContentPlanner class
@Entity
public class ContentPost implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)  // once set, it can never be updated for ID
    private  Long id;
    private String title;
    private String date;

    // constructors
    public ContentPost() {}

    public ContentPost(String title, String date){
        this.title = title;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ContentPlaner [title=" + title + ", date=" + date + "]";
    }

}
