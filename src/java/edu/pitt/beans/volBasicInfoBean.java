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
public class volBasicInfoBean {
    private int volid;
    private int userid;
    private int ava_time;
    private int strength;
    private int domain;

    public volBasicInfoBean(int volid, int userid, int ava_time, int strength, int domain) {
        this.volid = volid;
        this.userid = userid;
        this.ava_time = ava_time;
        this.strength = strength;
        this.domain = domain;
    }

    public volBasicInfoBean() {
    }

    public int getVolid() {
        return volid;
    }

    public void setVolid(int volid) {
        this.volid = volid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAva_time() {
        return ava_time;
    }

    public void setAva_time(int ava_time) {
        this.ava_time = ava_time;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDomain() {
        return domain;
    }

    public void setDomain(int domain) {
        this.domain = domain;
    }
    
    
    
    
}
