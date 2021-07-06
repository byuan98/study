package code;

public class ArrayReverse {
//	дһ��������һ��int���� Ԫ�صߵ�
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        int[] arrayReverse = arrayReverse(array);
        inputArray(arrayReverse);
    }

    private static int[] arrayReverse(int[] array) {
        int[] arrayReverse = new int[array.length];
        for (int indexArrayReverse = 0; indexArrayReverse < array.length; indexArrayReverse++) {
            arrayReverse[indexArrayReverse] = array[array.length - indexArrayReverse - 1];
        }
        return arrayReverse;
    }

    private static void inputArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
