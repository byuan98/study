package job;

public class ArrayMaxIndexAll {
//	定义一个含有10个元素的数组：打印输出所有最大值元素的下标
    public static void main(String[] args) {
        // 想要知道所有最大值元素的下标需要首先得知这个数组中的最大元素是多少
        // 然后对数组进行循环，等于这个最大值时，输出当前的循环次数即下标
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
        System.out.print("所有最大值元素的下标为：");
        for (int index = 0; index < array.length; index++) {
            if (array[index] == max) {
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }
}
