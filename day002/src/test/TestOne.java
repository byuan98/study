package test;

public class TestOne {

    public static void main(String[] args) {
        Zi zi = new Zi(7, 8, 9, 10);
        System.out.println(zi.a);// 2
        System.out.println(zi.e);// 10
        /*
         * �����a�����Ϊa��Ĭ��ֵ��2������˵Ӧ����7���������������� ��Ϊ����Ĺ��췽��֮�����ȶ�����super(a,b,c)(��������������Ĺ��췽��)
         * ���ԣ�������ĸ�������3���������˸���Ĺ��췽����������Ĳ��� ���췽���У�ֻ��eͨ���βα����������ı�������������е�e
         * ����������⣬�βα��ǰ�����������������super��ȡ�ˣ�
         */

    }
}

class Fu {
    int a;
    int b = 1;
    static int c = 1;

    void hai() {
    }

    void haha() {
    }

    static void hello() {
    }

    Fu() {
    }

    Fu(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class Zi extends Fu {
    int a = 2;
    int e = 3;
    static int f = 1;

    void hai() {
    }

    void nihao() {
    }

    Zi(int a, int b, int c, int e) {
        super(a, b, c);
        this.e = e;

    }
}