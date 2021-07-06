package com.godfery.test;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.godfery.entity.Code;

public class TestOne {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Code code=new Code().setType("张雷锋")
                            .setId("byuan98@outlook.com")
                            .setPwd("123456789");
        
        System.out.println(code);
        System.out.println(new Code().setType(code.getType()).getType());
        System.out.println(new Code().setId(code.getId()).getId());
        System.out.println(new Code().setPwd(code.getPwd()).getPwd());
    }

}
