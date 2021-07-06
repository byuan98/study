package code;

public class ArrayMergeThree {
//	创建两个数组：由已有的两个数组得到一个新的数组
//    {1,4,6,8,9} {3,5,7}----{4,9,13,8,9} 
    public static void main(String[] args) {
        // 合并规则:合并后数组的长度等于两数组中最大长度数组的长度
        // 合并后元素的值等于两数组下标相同元素的和
        int[] arrayOne = { 1, 4, 6, 8, 9 };
        int[] arrayTwo = { 3, 5, 7 };

        int[] arrayMerge = new int[arrayOne.length > arrayTwo.length ? arrayOne.length : arrayTwo.length];

        for (int indexMerge = 0; indexMerge < arrayMerge.length; indexMerge++) {
            try {
                arrayMerge[indexMerge] = arrayOne[indexMerge] + arrayTwo[indexMerge];
            } catch (ArrayIndexOutOfBoundsException e) {
                if (arrayOne.length > arrayTwo.length) {
                    arrayMerge[indexMerge] = arrayOne[indexMerge];
                } else {
                    arrayMerge[indexMerge] = arrayTwo[indexMerge];
                }
            }
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
