package job;

public class ArrayMaxIndexAll {
//	����һ������10��Ԫ�ص����飺��ӡ����������ֵԪ�ص��±�
    public static void main(String[] args) {
        // ��Ҫ֪���������ֵԪ�ص��±���Ҫ���ȵ�֪��������е����Ԫ���Ƕ���
        // Ȼ����������ѭ��������������ֵʱ�������ǰ��ѭ���������±�
        int[] array = { 1, 2, 3, 9, 4, 5, 6, 9, 7, 8 };
        inputIndexMax(array, arrayMax(array));

    }

    private static int arrayMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            max = max > element ? max : element;
        }
        return max;
    }

    private static void inputIndexMax(int[] array, int max) {
        System.out.print("�������ֵԪ�ص��±�Ϊ��");
        for (int index = 0; index < array.length; index++) {
            if (array[index] == max) {
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }
}
