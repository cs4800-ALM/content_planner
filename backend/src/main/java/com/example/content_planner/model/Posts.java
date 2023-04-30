package com.example.content_planner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "title_name")
    private String title;

    @Column(name = "post_date")
    private String postDate;

    @Column(name = "audio_name")
    private String audioName;

    @Column(name = "content_categ")
    private String contentCateg;

    @Column(name = "scroll_stopper")
    private String scrollStopper;

    @Column(name = "caption_name")
    private String caption;

    @Column(name = "user_name")
    private String hashtags;

    @Column(name = "tags_name")
    private String tags;

    @Column(name = "alt_text")
    private String altText;


    public Posts(){

    }

    public Posts(String title, String postDate, String audioName, String contentCateg, String scrollStopper, String caption, String hashtags, String tags, String altText) {
        super();
        this.title = title;
        this.postDate = postDate;
        this.audioName = audioName;
        this.contentCateg = contentCateg;
        this.scrollStopper = scrollStopper;
        this.caption = caption;
        this.hashtags = hashtags;
        this.tags = tags;
        this.altText = altText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    public String getContentCateg() {
        return contentCateg;
    }

    public void setContentCateg(String contentCateg) {
        this.contentCateg = contentCateg;
    }

    public String getScrollStopper() {
        return scrollStopper;
    }

    public void setScrollStopper(String scrollStopper) {
        this.scrollStopper = scrollStopper;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }
}
