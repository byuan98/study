package com.godfery.entity;

import java.io.Serializable;

public class AutoTable implements Serializable{
    private Integer autid;
    private String autname;
    
    public AutoTable() {

    }
    public AutoTable(Integer autid, String autname) {
        this.autid = autid;
        this.autname = autname;
    }
    
    public Integer getAutid() {
        return autid;
    }
    public void setAutid(Integer autid) {
        this.autid = autid;
    }
    public String getAutname() {
        return autname;
    }
    public void setAutname(String autname) {
        this.autname = autname;
    }

    public String toString() {
        return "AutoTable [autid=" + autid + ", autname=" + autname + "]";
    }
}
