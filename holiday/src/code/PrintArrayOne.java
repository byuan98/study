package code;

public class PrintArrayOne {
//	��ӡ�������£�
//	   {1,4,7,5,3}
//	   1 *
//	   4 * * * *
//	   7 * * * * * * *
//	   5 * * * * *
//	   3 * * *
    public static void main(String[] args) {
        // ÿ�еĴ�ӡ�������������Ӧ�±�Ԫ�ص�ֵ(����0�п�ʼ)
        // ��,ȡ��ÿ��Ԫ�ص�ֵ��Ϊѭ��������ӡ����
        int[] array = { 1, 4, 7, 5, 3 };

        for (int element : array) {
            for (int number = 0; number < element; number++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }

    }

}
