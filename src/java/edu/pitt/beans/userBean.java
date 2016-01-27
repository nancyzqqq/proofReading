/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.beans;

/**
 *
 * @author zhangqian
 */
public class userBean {
    private int userID;
    private String username;
    private String password;
    private String email;
    private int type;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUername() {
        return username;
    }

    public void setUername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public userBean(int userID, String username, String password, String email, int type) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.type = type;
    }

    public userBean() {
    }

    public userBean(String username, String password, String email, int type) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.type = type;
    }
    
}
