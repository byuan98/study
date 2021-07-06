package code;

public class ArrayMergeTwo {
//	�����������飺�����е���������õ�һ���µ�����
//    {1,4,10,8,9} {3,5,7,2,2,1,2}----{3,5,10,8,9,2,1,2} 
    public static void main(String[] args) {
        // �ϲ������������Ӧ�±�Ԫ�����,�ϴ�ĸ��ǽ�С��,�ϲ�����ĳ���ȡ�������鳤�������Ǹ���+1

        int[] arrayOne = { 1, 4, 10, 8, 9 };
        int[] arrayTwo = { 3, 5, 7, 2, 2, 1, 2 };

        int[] arrayMerge = new int[arrayOne.length > arrayTwo.length ? arrayOne.length + 1 : arrayTwo.length + 1];

        for (int indexMerge = 0; indexMerge < arrayMerge.length; indexMerge++) {
            try {
                arrayMerge[indexMerge] = arrayOne[indexMerge] > arrayTwo[indexMerge] ? arrayOne[indexMerge]
                        : arrayTwo[indexMerge];
            } catch (ArrayIndexOutOfBoundsException e) {
                if (arrayOne.length > arrayTwo.length) {
                    arrayMerge[indexMerge] = arrayOne.length - arrayTwo.length;
                    arrayMerge[indexMerge + 1] = arrayOne[indexMerge];
                    arrayMerge[indexMerge + 2] = arrayOne[indexMerge + 1];
                    break;
                } else {
                    arrayMerge[indexMerge] = arrayTwo.length - arrayOne.length;
                    arrayMerge[indexMerge + 1] = arrayTwo[indexMerge];
                    arrayMerge[indexMerge + 2] = arrayTwo[indexMerge + 1];
                    break;
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
