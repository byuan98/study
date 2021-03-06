package cn.godfery.test;

import java.util.Arrays;
import java.util.Comparator;

public class TestTwo {
//    Lambda表达式案例二：比较器
    public static void main(String[] args) {
        String[] stringArray= {"a", "abc", "ab", "123456", "654321"};
        Arrays.sort(stringArray, (object1, object2)->{
            if(object1.toString().length() != object1.toString().length()) {
                return object1.length() - object2.length();
            }
            return object1.compareTo(object2);
        });
        
        Arrays.sort(stringArray);
        for (String stringPart : stringArray){
            System.out.println(stringPart);
        }
    }
}
