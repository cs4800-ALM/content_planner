package com.example.content_planner.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private String userName;
    @Column(name = "email_address")
    private String email;
    @Column(name = "first_name")
    private String fName;
    @Column(name = "last_name")
    private String lName;
//    @Column(name = "home_address")
//    private String address;
    @Column(name = "about_me")
    private String aboutMe;


    public User(){ }

    public User(String userName, String email, String fName, String lName, String aboutMe) {
        super();
        this.userName = userName;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
//        this.address = address;
        this.aboutMe = aboutMe;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

}

