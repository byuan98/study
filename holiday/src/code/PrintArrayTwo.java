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
        // 第一行的*对应了数组中元素最大值的下标,对第一行的最大值进行-1操作
        // 重复打印最大值对应下标位值的*,重复对最大值进行-1操作
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

    private static int arrayMax(int[] array) { // 先找出数组元素最大值
        int[] maxIndex = new int[array.length];
        int max = array[0];
        for (int index = 1; index < array.length; index++) {
            max = max > array[index] ? max : array[index];
        }
        return max;
    }

    private static int[] arrayMaxIndex(int[] array, int max) { // 记录元素最大值下标,以1作为标记
        int[] maxIndex = new int[array.length];
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (max == array[arrayIndex]) {
                maxIndex[arrayIndex] = 1;
            }
        }
        return maxIndex;
    }
}
