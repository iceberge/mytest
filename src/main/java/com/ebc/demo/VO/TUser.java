package com.ebc.demo.VO;

import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String openid;

    private String sessionkey;

    private String fatheropenid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * @return sessionkey
     */
    public String getSessionkey() {
        return sessionkey;
    }

    /**
     * @param sessionkey
     */
    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }

    /**
     * @return fatheropenid
     */
    public String getFatheropenid() {
        return fatheropenid;
    }

    /**
     * @param fatheropenid
     */
    public void setFatheropenid(String fatheropenid) {
        this.fatheropenid = fatheropenid;
    }
}