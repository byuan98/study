package test;

import java.util.*;

public class TestTwo {
//    集合框架之单列集合测试
    public static void main(String[] args) {
//        单列集合的顶层接口：Collection，Collection实现自Iterable
//        Collection下有两个实现接口：List、Set
//        List下有三个实现类：ArrayList、Vector、LinkedList
//        set下有两个实现类HashSet、TreeSet

//        collectionTest();
        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add("Hi");
        al.add("Yes");
        al.add("Yes123");
        al.add("123");
        System.out.println("遍历前：" + al);
        for (Object obj : al) {
            if (obj.equals("Yes")) {
                System.out.println("执行了");
                al.remove(obj);
            }
        }
        System.out.println(al);
//        
//        for(Object obj:al){
//            if(obj=="Hi"){
//                al.remove(obj);
//            }
//        }
//        System.out.println("第一次foreach："+al);
//        
//        for(Object obj:al) {
//            al.remove(obj);
//        }
//        System.out.println("第二次foreach："+al);

//        
//        for(Object obj:al) {
//            if(obj=="Hi") {
//                al.remove("Hi");
//            }
//        }
//        System.out.println("第二次foreach："+al);
//        for(Object obj:al) {
//            al.remove(obj);
//        }
//        for(Object obj:al) {
//            if(obj.equals("Hi")) {
//                al.remove(obj);
//                System.out.println("执行了");
//            }
//        }
//        Iterator it=al.iterator();
//        while(it.hasNext()) {
//           it.remove();
//           it.next();             
//        }
//        System.out.println(al);
    }

    private static void collectionTest() {// 单列集合顶层接口Collection测试
//        由于Collection接口我们无法实例化，所以我们借助ArrayList实现多态来进行方法测试
//        Collection的常用方法：
//            boolean add(Object e)
//            boolean addAll(Collection c)//当参数为null时，会出现NullPointException异常
//            void clear()//清空
//            boolean remove(Object o)//把当前集合中的第一个o元素删除
//            int size()//获取元素个数
//            boolean contains(Object o)//判断当前集合是否包含参数元素o
//            boolean isEmpty()//判断当前集合是否为空  size=0
//            Object[] toArray()//获取当前集合对应的数组对象

//        Collection的遍历：
//        遍历方式1：转换成数组，使用循环进行遍历
        Collection collection = new ArrayList();
        collection.add("Hello,world");
        collection.add('v');
        collection.add(new Object[1]);

        Object[] objs = collection.toArray();
        for (int index = 0; index < objs.length; index++) {
            System.out.print(objs[index] + " ");
        }
        System.out.println();

//        遍历方式2：使用foreach循环进行遍历
        for (Object obj : collection) {
            System.out.print(obj + " ");
            collection.remove(obj);
        }
        System.out.println();

//        遍历方式3：使用迭代器
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
