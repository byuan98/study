package code;

public class ArrayMergeOne {
//	�����������飺�����е���������õ�һ���µ�����
//    {1,4,6,8,9} {3,5,7}----{1,4,6,8,9,3,5,7} 
    public static void main(String[] args) {
        // �ϲ�����������ƴ��
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
