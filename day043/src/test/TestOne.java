package test;

import java.util.*;

public class TestOne {

    public static void main(String[] args) {
        System.out.println(change("yes i do"));
    }

    private static String change(String s) {
        ArrayList<String> al = new ArrayList();
        String word = "";
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == ' ') {
                al.add(word);
                word = "";
                continue;
            }
            word += s.charAt(index);
        }
        al.add(word);
        String sResvers = "";
        for (String part : al) {
            sResvers = part + " " + sResvers;
        }
        System.out.println(al);
        return sResvers.strip();
    }
}
