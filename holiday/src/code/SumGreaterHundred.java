package code;

public class SumGreaterHundred {
//	��1+2+3+...�ӵ�����ʱ��Ϳ�ʼ����1000
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1;; number++) {
            sum += number;
            if (sum > 1000) {
                System.out.println("1+2+3+...�ӵ�" + number + "��ʱ��Ϳ�ʼ����1000");
                break;
            }
        }

    }

}
