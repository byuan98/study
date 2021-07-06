package code;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int interim;
        boolean move;
        for (int i = 0; i < array.length; i++) {
            move = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    interim = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = interim;
                    move = true;
                }
            }
            if (move == false) {
                break;
            }
            System.out.print("µÚ" + i + "ÂÖÅÅĞò");
            inputArray(array);
        }

    }

    private static void inputArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
