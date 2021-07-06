package job;

public class OrderSort {
//	顺序排序的画图和代码
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 };
        orderSort(array);
        inputArray(array);

    }

    private static void orderSort(int[] array) {
        int interim; // 临时变量
        for (int indexLow = 0; indexLow < array.length - 1; indexLow++) {
            for (int indexHigh = indexLow + 1; indexHigh < array.length; indexHigh++) {
                if (array[indexLow] < array[indexHigh]) {
                    interim = array[indexLow];
                    array[indexLow] = array[indexHigh];
                    array[indexHigh] = interim;

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
