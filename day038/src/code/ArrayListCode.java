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

        // ����ArrayList��ʽһ:ת��Ϊ����Ȼ����б���
        Object[] obj = a.toArray();
        for (int index = 0; index < obj.length; index++) {
            System.out.print(obj[index] + " ");
        }
        System.out.println();

        // ����ArrayList��ʽ��:foreach
        for (Object obj1 : a) {
            System.out.print(obj1 + " ");
        }
        System.out.println();
        // ����ArrayList��ʽ��:������
        Iterator it = a.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // ����ArrayList��ʽ��:ͨ��get����,��ȡ�±�Ԫ�ؽ��б���
        for (int index = 0; index < a.size(); index++) {
            System.out.print(a.get(index) + " ");
        }
    }
}
