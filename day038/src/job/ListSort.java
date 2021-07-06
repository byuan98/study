package job;

import java.util.*;

public class ListSort {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        for (int count = 0; count < 10; count++) {
            list.add("" + (char) (Math.random() * 26 + 'a') + (char) (Math.random() * 26 + 'a')
                    + (char) (Math.random() * 26 + 'a'));
        }
        System.out.println(list);

        listSort(list);

    }

    private static void listSort(ArrayList<String> list) {
        for (int indexLow = 0; indexLow < list.size() - 1; indexLow++) {
            for (int indexHigh = indexLow + 1; indexHigh < list.size(); indexHigh++) {
                if (list.get(indexHigh).compareTo(list.get(indexLow)) < 0) {
//					String str=list.set(indexHigh,list.get(indexLow));
//					list.set(indexLow, str);
                    list.set(indexLow, list.set(indexHigh, list.get(indexLow)));// 与上一条语句等价
                }
            }
        }
        System.out.println(list);
    }

}
