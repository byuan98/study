package code;

public class NumberSquare {
//	дһ��������n�Ŀ���
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
