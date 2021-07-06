package job;

import java.util.*;

public class Union {
//	 写一个方法：Collection getBingJi(Collection c1,Collection c2);
//     返回值集合中 既包含了c1中的所有元素 也包含了c2中的元素 但不能重复
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c2.add(2);
        c2.add(3);
        c2.add(4);
        // Collection c3=getBingJi(c1, c2);
        // System.out.println(c3);

    }
//	private static Collection getBingJi(Collection c1,Collection c2) {
//		Collection c3=c1;
//		Object []o1=c1.toArray();
//		Object []o2=c2.toArray();
//		
//		for(int indexO2=0;indexO2<o2.length;indexO2++) {
//			boolean flag=true;
//			for(int indexO1=0;indexO1<o1.length;indexO1++) {
//				if(o1[indexO1].toString().equals(o2[indexO2].toString())) {
//					flag=false;
//					break;
//			    }
//		    }
//			if(flag) {
//				c3.add(o2[indexO2]);
//			}
//	    }
//		return c3;
}
