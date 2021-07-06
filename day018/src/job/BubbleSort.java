package job;

public class BubbleSort {
//	冒泡排序的 画图和代码
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
        bubbleSort(array);
        inputArray(array);

    }

    private static void bubbleSort(int[] array) {
        int interim; // 临时变量
        for (int round = 0; round < array.length; round++) {
            for (int index = 0; index < array.length - round - 1; index++) {
                if (array[index] > array[index + 1]) {
                    interim = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = interim;
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
