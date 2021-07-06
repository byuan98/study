package code;

public class ArrayMergeThree {
//	�����������飺�����е���������õ�һ���µ�����
//    {1,4,6,8,9} {3,5,7}----{4,9,13,8,9} 
    public static void main(String[] args) {
        // �ϲ�����:�ϲ�������ĳ��ȵ�������������󳤶�����ĳ���
        // �ϲ���Ԫ�ص�ֵ�����������±���ͬԪ�صĺ�
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
