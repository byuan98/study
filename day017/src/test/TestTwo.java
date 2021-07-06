package test;

public class TestTwo {

    public static void main(String[] args) {
        /*
         * byte b1=1; int i1=1;byte b2=i1; int i1='1'; float f1=1; float f1=1.0; long
         * lon='a';float f1=lon; double d1=1; float f1=1; double d1=f1; char c1=19999;
         * char c1=19999L;
         * 
         * 
         */

        int a = 1;
        int b = a;
        System.out.println("b=" + b);
        b = b + 1;
        System.out.println("b=" + b);
        System.out.println("a=" + a);

    }

}
