package test;

import java.util.HashSet;

public class TestTwo {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        for (int count = 0; count < 5; count++) {
            Teacher s = new Teacher();
            boolean b = set.add(s);
            System.out.println("添加" + s + ":" + b);
        }
    }
}

class Teacher {
    private static int n = 0;
    final int index;// 定义一个变量记录当前对象是第几个Student对象

    public Teacher() {
        n++;
        index = n;
    }

    public String toString() {
        return "student:index=" + index;
    }

    public int hashCode() {// 重写hashCode方法
        System.out.println(index + "的hashCode方法被调用了");
        return index % 2;
    }

    public boolean equals(Object obj) {// 重写equals方法
        System.out.println(index + "的equals方法被调用与" + ((Teacher) obj).index + "作比较");
        return super.equals(obj);
    }
}
