package test;

import java.util.HashSet;

public class TestTwo {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        for (int count = 0; count < 5; count++) {
            Teacher s = new Teacher();
            boolean b = set.add(s);
            System.out.println("���" + s + ":" + b);
        }
    }
}

class Teacher {
    private static int n = 0;
    final int index;// ����һ��������¼��ǰ�����ǵڼ���Student����

    public Teacher() {
        n++;
        index = n;
    }

    public String toString() {
        return "student:index=" + index;
    }

    public int hashCode() {// ��дhashCode����
        System.out.println(index + "��hashCode������������");
        return index % 2;
    }

    public boolean equals(Object obj) {// ��дequals����
        System.out.println(index + "��equals������������" + ((Teacher) obj).index + "���Ƚ�");
        return super.equals(obj);
    }
}
