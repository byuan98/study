package test;

public class TestFour {

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.getValue());
    }
}

class Test {
    private int value;

    public int getValue() {
        return this.value;
    }
}