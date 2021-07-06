package job;

import java.util.*;

public class ArrayListImitationSet {

    public static void main(String[] args) {
        listImitationSet();

    }

    private static void listImitationSet() {
        ArrayList<String> list = new ArrayList();
        while (true) {
            if (list.size() == 26) {
                break;
            }
            String str = "" + (char) (Math.random() * 26 + 'a');
            if (list.indexOf(str) == -1) {
                list.add(str);
            }
        }
        System.out.println(list);
    }
}
