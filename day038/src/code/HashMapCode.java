package code;

import java.util.*;

public class HashMapCode {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("1", 10001);
        hm.put("2", 10002);
        hm.put("3", 10003);
        hm.put("4", 10004);
        System.out.println(hm);

        HashMap<String, Integer> hm2 = new HashMap(hm);
        hm2.remove("1");
        System.out.println(hm2.keySet());
        System.out.println(hm2.values());
        System.out.println(hm2.entrySet());

    }

}
