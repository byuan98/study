package test;

public class TestOne {

    public static void main(String[] args) {
        int[] array = { 7, 2, 9, 6, 8, 5, 1, 4, 3 };
        arrayInput(array);

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int s = array[i];// 如果不存放array[i]的值的话，如果array[j]向后移动的话，会把原来的array[i]的值顶掉
            for (; j >= 0; j--) {
                if (array[j] > s) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = s;
        }
        arrayInput(array);
    }

    private static void arrayInput(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + (index == array.length - 1 ? "\n" : ","));
        }
    }
}
