package code;

public class PrintArrayTwo {
//	   {1,4,7,5,3}
//	   1  4   7   5   3
//	          *
//	          *
//	          *   *
//	      *   *   *
//	      *   *   *   *
//	      *   *   *   *
//	   *  *   *   *   * 
    public static void main(String[] args) {
        // ��һ�е�*��Ӧ��������Ԫ�����ֵ���±�,�Ե�һ�е����ֵ����-1����
        // �ظ���ӡ���ֵ��Ӧ�±�λֵ��*,�ظ������ֵ����-1����
        int[] array = { 1, 4, 7, 5, 3 };

        while (true) {
            int[] arrayMaxIndex = arrayMaxIndex(array, arrayMax(array));
            for (int index = 0; index < arrayMaxIndex.length; index++) {
                if (arrayMaxIndex[index] == 1) {
                    System.out.print("*" + "\t");
                    array[index] -= 1;
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            if (array[0] == 0) {
                break;
            }
        }

    }

    private static int arrayMax(int[] array) { // ���ҳ�����Ԫ�����ֵ
        int[] maxIndex = new int[array.length];
        int max = array[0];
        for (int index = 1; index < array.length; index++) {
            max = max > array[index] ? max : array[index];
        }
        return max;
    }

    private static int[] arrayMaxIndex(int[] array, int max) { // ��¼Ԫ�����ֵ�±�,��1��Ϊ���
        int[] maxIndex = new int[array.length];
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (max == array[arrayIndex]) {
                maxIndex[arrayIndex] = 1;
            }
        }
        return maxIndex;
    }
}
