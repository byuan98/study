package code;

public class InsertionSort {
//	写一个方法对int数组进行排序
    public static void main(String[] args) {
        // 插入排序
        int[] array = { 1, 4, 6, 8, 0, 9, 7, 5, 3, 2 };
        insertionSort(array);
        printArray(array);

    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int interem = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > interem) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = interem;
        }
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
