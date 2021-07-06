package code;

public class NumberSquare {
//	写一个方法求n的开方
    public static void main(String[] args) {
        System.out.println(square(16));

    }

    private static int square(int number) {
        int root = 1;
        while (true) {
            if (root * root == number) {
                return root;
            }
            root += 1;
        }
    }
}
