package test;

public class TestThree {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1);

        People1 p1 = new Chinase();
        System.out.println(p1.getClass());
    }
}

class People1 {

}

class Chinase extends People1 {

}
