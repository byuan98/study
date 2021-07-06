package job;

import java.util.*;

public class Intersection {
//	写一个方法：Collection getJiaoJi(Collection c1,Collection c2);
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);

        c2.add(2);
        c2.add(3);
        c2.add(4);

        Collection c3 = getJiaoJi(c1, c2);
        System.out.println(c3);
    }

    private static Collection getJiaoJi(Collection c1, Collection c2) {
        Object[] o1 = c1.toArray();
        Object[] o2 = c2.toArray();
        Collection c3 = new ArrayList();
        for (int indexO1 = 0; indexO1 < o1.length; indexO1++) {
            for (int indexO2 = 0; indexO2 < o2.length; indexO2++) {
                if (o1[indexO1].toString().equals(o2[indexO2].toString())) {
                    c3.add(o1[indexO1]);
                }
            }
        }
        return c3;
    }
}
