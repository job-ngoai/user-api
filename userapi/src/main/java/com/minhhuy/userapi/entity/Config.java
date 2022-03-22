package com.minhhuy.userapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "config")
public class Config {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    @Column(name = "app_name")
    String appName;

    @Column(name = "show_login")
    boolean showLogin;

    @Column(name = "is_android")
    boolean isAndroid;

    @Column(name = "is_ios")
    boolean isIos;

    @Column(name = "show_login_facbook")
    boolean showLoginFacebook;

    public Config() {
    }

    public Config(int id, String appName, boolean showLogin, boolean isAndroid, boolean isIos, boolean showLoginFacebook) {
        this.id = id;
        this.appName = appName;
        this.showLogin = showLogin;
        this.isAndroid = isAndroid;
        this.isIos = isIos;
        this.showLoginFacebook = showLoginFacebook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public boolean isShowLogin() {
        return showLogin;
    }

    public void setShowLogin(boolean showLogin) {
        this.showLogin = showLogin;
    }

    public boolean isAndroid() {
        return isAndroid;
    }

    public void setAndroid(boolean android) {
        isAndroid = android;
    }

    public boolean isIos() {
        return isIos;
    }

    public void setIos(boolean ios) {
        isIos = ios;
    }

    public boolean isShowLoginFacebook() {
        return showLoginFacebook;
    }

    public void setShowLoginFacebook(boolean showLoginFacebook) {
        this.showLoginFacebook = showLoginFacebook;
    }
}
