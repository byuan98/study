package code;

public class Title2 {
//  �ж�101-200֮���ж��ٸ�����,���������������
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 101; number <= 200; number++) {
            if (primeNumber(number)) {
                System.out.println(number + "������");
                sum++;
            }
        }
        System.out.println("101-200��������" + sum + "��");
    }

    private static boolean primeNumber(int number) {
        for (int factor = 2; factor < number; factor++) {
            if (number % factor == 0) {
                return false;
            }
        }
        return true;
    }
}
