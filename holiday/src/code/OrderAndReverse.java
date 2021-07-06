package code;

public class OrderAndReverse {
//	����һ������20��Ԫ�ص����飺��ǰ10��Ԫ���������� ��10��Ԫ�ص�������
    public static void main(String[] args) {
        int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        orderSort(array, 0, 10);
        reverseSort(array, 11, 20);
        inputArray(array);

    }

    private static void orderSort(int[] array, int indexLow, int indexHigh) { // ð���������˳������
        int interim; // ��ʱ����
        for (int round = 0; round < indexHigh - 1; round++) {
            for (int index = indexLow; index < indexHigh - 1; index++) {
                if (array[index] > array[index + 1]) {
                    interim = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = interim;
                }
            }
        }
    }

    private static void reverseSort(int[] array, int indexHigh, int indexLow) { // ˳�����������������
        int interim; // ��ʱ����
        for (int index = indexHigh - 1; index < indexLow - 1; index++) {
            for (int index_ = index + 1; index_ < indexLow; index_++) {
                if (array[index] < array[index_]) {
                    interim = array[index];
                    array[index] = array[index_];
                    array[index_] = interim;

                }
            }
        }
    }

    private static void inputArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
