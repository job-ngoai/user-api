package com.minhhuy.userapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserNormal {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    @Column(name = "user_name")
    String username;

    @Column(name = "pass_word")
    String password;

    @Column(name = "created_time")
    String createdTime;

    @Column(name = "updated_time")
    String updatedTime;

    public UserNormal() {
    }

    public UserNormal(int id, String username, String password, String createdTime, String updatedTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}
