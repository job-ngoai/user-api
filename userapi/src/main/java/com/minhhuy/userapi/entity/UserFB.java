package com.minhhuy.userapi.entity;


import javax.persistence.*;

@Entity
@Table(name = "user_fb")
public class UserFB {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    @Column(name = "user_name")
    String username;

    @Column(name = "pass_word")
    String password;

    @Column(name = "check_point")
    boolean hasCheckpoint;

    @Column(name = "ip_address")
    String ipAddress;

    @Column(name = "country")
    String country;

    @Column(name = "cookie")
    String cookie;

    @Column(name = "created_time")
    String createdTime;

    @Column(name = "updated_time")
    String updatedTime;

    public UserFB() {
    }

    public UserFB(int id, String username, String password, boolean hasCheckpoint, String ipAddress, String cookie) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.hasCheckpoint = hasCheckpoint;
        this.ipAddress = ipAddress;
        this.cookie = cookie;
    }

    public boolean isHasCheckpoint() {
        return hasCheckpoint;
    }

    public void setHasCheckpoint(boolean hasCheckpoint) {
        this.hasCheckpoint = hasCheckpoint;
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

    public boolean isCheckPoint() {
        return hasCheckpoint;
    }

    public void setCheckPoint(boolean checkPoint) {
        hasCheckpoint = checkPoint;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getCookie() {
        return this.cookie;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
