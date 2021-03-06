package com.godfery.entity;

import java.io.UnsupportedEncodingException;

public class Code {
    private String type;
    private String id;
    private String pwd;
    private static final Integer key=-1;
    
    public Code() {
        
    }

    public String getType() {
        return type;
    }
    public Code setType(String type) {
        this.type = encoding(type);
        return this;
    }
    public String getId() {
        return id;
    }
    public Code setId(String id) {
        this.id = encoding(id);
        return this;
    }
    public String getPwd() {
        return pwd;
    }
    public Code setPwd(String pwd) {
        this.pwd = encoding(pwd);
        return this;
    }
    
    private static String encoding(String str) {
        byte[] byteEncoding;
        try {
            byteEncoding = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException();
        }
        for(Integer index=0;index<byteEncoding.length;index++) {
            System.out.println(byteEncoding[index]);
            byteEncoding[index]*=key;
            System.out.println(byteEncoding[index]);
            System.out.println("-----------");
        }
        return new String(byteEncoding);
    }

    @Override
    public String toString() {
        return "Code [type=" + type + ", id=" + id + ", pwd=" + pwd + "]";
    }
    
}
