package code;

public class ArrayMergeOne {
//	创建两个数组：由已有的两个数组得到一个新的数组
//    {1,4,6,8,9} {3,5,7}----{1,4,6,8,9,3,5,7} 
    public static void main(String[] args) {
        // 合并规则：两数组拼接
        int[] arrayOne = { 1, 4, 6, 8, 9 };
        int[] arrayTwo = { 3, 5, 7 };

        int[] arrayMerge = new int[arrayOne.length + arrayTwo.length];

        for (int indexMerge = 0; indexMerge < arrayOne.length; indexMerge++) {
            arrayMerge[indexMerge] = arrayOne[indexMerge];
        }

        for (int indexMerge = 0; indexMerge < arrayTwo.length; indexMerge++) {
            arrayMerge[indexMerge + arrayOne.length] = arrayTwo[indexMerge];
        }

        printArray(arrayMerge);

    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
