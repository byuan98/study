package code;

import java.util.*;

public class ArrayListCode {
//  ArrayList
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        for (int count = 0; count < 10; count++) {
            a.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(a);

        // 遍历ArrayList方式一:转换为数组然后进行遍历
        Object[] obj = a.toArray();
        for (int index = 0; index < obj.length; index++) {
            System.out.print(obj[index] + " ");
        }
        System.out.println();

        // 遍历ArrayList方式二:foreach
        for (Object obj1 : a) {
            System.out.print(obj1 + " ");
        }
        System.out.println();
        // 遍历ArrayList方式三:迭代器
        Iterator it = a.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // 遍历ArrayList方式四:通过get方法,获取下标元素进行遍历
        for (int index = 0; index < a.size(); index++) {
            System.out.print(a.get(index) + " ");
        }
    }
}
