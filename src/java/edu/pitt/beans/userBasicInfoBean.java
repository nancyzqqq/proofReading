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
public class userBasicInfoBean {

    private String username;
    private String firstname;
    private String lastname;
    private String institution;
    private String domainInterests;
//constructor1(all )
    public userBasicInfoBean(String username, String firstname, String lastname, String institution, String domainInterests) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.institution = institution;
        this.domainInterests = domainInterests;
    }
//

    public userBasicInfoBean() {
    }

    public String getUername() {
        return username;
    }

    public void setUername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDomainInterests() {
        return domainInterests;
    }

    public void setDomainInterests(String domainInterests) {
        this.domainInterests = domainInterests;
    }

    

}
