package test;

import java.util.*;

public class TestTwo {
//    ���Ͽ��֮���м��ϲ���
    public static void main(String[] args) {
//        ���м��ϵĶ���ӿڣ�Collection��Collectionʵ����Iterable
//        Collection��������ʵ�ֽӿڣ�List��Set
//        List��������ʵ���ࣺArrayList��Vector��LinkedList
//        set��������ʵ����HashSet��TreeSet

//        collectionTest();
        ArrayList al = new ArrayList();
        al.add("Hello");
        al.add("Hi");
        al.add("Yes");
        al.add("Yes123");
        al.add("123");
        System.out.println("����ǰ��" + al);
        for (Object obj : al) {
            if (obj.equals("Yes")) {
                System.out.println("ִ����");
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
//        System.out.println("��һ��foreach��"+al);
//        
//        for(Object obj:al) {
//            al.remove(obj);
//        }
//        System.out.println("�ڶ���foreach��"+al);

//        
//        for(Object obj:al) {
//            if(obj=="Hi") {
//                al.remove("Hi");
//            }
//        }
//        System.out.println("�ڶ���foreach��"+al);
//        for(Object obj:al) {
//            al.remove(obj);
//        }
//        for(Object obj:al) {
//            if(obj.equals("Hi")) {
//                al.remove(obj);
//                System.out.println("ִ����");
//            }
//        }
//        Iterator it=al.iterator();
//        while(it.hasNext()) {
//           it.remove();
//           it.next();             
//        }
//        System.out.println(al);
    }

    private static void collectionTest() {// ���м��϶���ӿ�Collection����
//        ����Collection�ӿ������޷�ʵ�������������ǽ���ArrayListʵ�ֶ�̬�����з�������
//        Collection�ĳ��÷�����
//            boolean add(Object e)
//            boolean addAll(Collection c)//������Ϊnullʱ�������NullPointException�쳣
//            void clear()//���
//            boolean remove(Object o)//�ѵ�ǰ�����еĵ�һ��oԪ��ɾ��
//            int size()//��ȡԪ�ظ���
//            boolean contains(Object o)//�жϵ�ǰ�����Ƿ��������Ԫ��o
//            boolean isEmpty()//�жϵ�ǰ�����Ƿ�Ϊ��  size=0
//            Object[] toArray()//��ȡ��ǰ���϶�Ӧ���������

//        Collection�ı�����
//        ������ʽ1��ת�������飬ʹ��ѭ�����б���
        Collection collection = new ArrayList();
        collection.add("Hello,world");
        collection.add('v');
        collection.add(new Object[1]);

        Object[] objs = collection.toArray();
        for (int index = 0; index < objs.length; index++) {
            System.out.print(objs[index] + " ");
        }
        System.out.println();

//        ������ʽ2��ʹ��foreachѭ�����б���
        for (Object obj : collection) {
            System.out.print(obj + " ");
            collection.remove(obj);
        }
        System.out.println();

//        ������ʽ3��ʹ�õ�����
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}