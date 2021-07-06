package code;

public class OrderAndReverse {
//	定义一个含有20个元素的数组：对前10个元素正序排序 后10个元素倒序排序
    public static void main(String[] args) {
        int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        orderSort(array, 0, 10);
        reverseSort(array, 11, 20);
        inputArray(array);

    }

    private static void orderSort(int[] array, int indexLow, int indexHigh) { // 冒泡排序进行顺序排序
        int interim; // 临时变量
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

    private static void reverseSort(int[] array, int indexHigh, int indexLow) { // 顺序排序进行逆序排序
        int interim; // 临时变量
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
