package job;

import java.util.*;

public class CollectionOperation {
//	创建一个集合 装5个整数和5个字符串 请获取集合中数字元素的平均值
//  并删除含有a字符的元素
    public static void main(String[] args) {
        Collection c = new ArrayList();
//		c.add("asd");
//		c.add("sss");
//		c.add("sws");
//		c.add("ses");
//		c.add("sfs");
//		c.add(1);
//		c.add(1);
//		c.add(2);
//		c.add(1);
//		c.add(1);
        for (int count = 0; count < 5; count++) {
            c.add((int) (Math.random() * 100 + 1));
            c.add("" + (char) (Math.random() * 24 + 'a') + (char) (Math.random() * 24 + 'a')
                    + (char) (Math.random() * 24 + 'a'));
        }
        System.out.println(c);
        double a = numberAvg(c);
        System.out.println(a);
        deleteCharA(c);
        System.out.println(c);

    }
//	private static void deleteCharA(Collection c) {
//		Iterator it=c.iterator();
//		while(it.hasNext()) {
//			Object o=it.next();
//			if(o instanceof String && ((String) o).indexOf('a')!=-1) {
//				it.remove();
//			}
//		}
//	}

    private static void deleteCharA(Collection c) {
        Object[] obj = c.toArray();
        for (int index = 0; index < obj.length; index++) {
            if (obj[index] instanceof String && (((String) obj[index]).indexOf('a') != -1)) {
                c.remove(obj[index]);
            }
        }
    }

    private static double numberAvg(Collection c) {
        int sum = 0;
        double count = 0;
        Iterator it = c.iterator();
        while (it.hasNext()) {// 判断迭代器中是否还有元素可以遍历
            Object o = it.next();// 获取一个元素
            if (o instanceof Integer) {
                sum += (Integer) o;
                count += 1;
            }
        }
        return sum / count;
    }
}
