package com.godfery.util;

public class MyMathImp{
    
//    public Integer add(Integer number1, Integer number2) {
//        return null;
//    }
    public static MyMath myMath=(Integer number1, Integer number2)->number1+number2;
    public static void main(String[] args) {
        System.out.println(myMath.add(12, 323));
    }
   
}
