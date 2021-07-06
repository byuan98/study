package code;

public class CocktailOrdering {
//º¶Œ≤æ∆≈≈–Ú
    public static void main(String[] args) {
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int interim;
        boolean move;
        round: for (int i = 0; i < array.length / 2; i++) {
            move = false;
            for (int low = 0, high = array.length - 1; low <= array.length / 2
                    && high >= array.length / 2; low++, high--) {
                if (array[low] > array[low + 1]) {
                    interim = array[low];
                    array[low] = array[low + 1];
                    array[low + 1] = interim;
                    move = true;
                }
                if (array[high] < array[high - 1]) {
                    interim = array[high];
                    array[high] = array[high - 1];
                    array[high - 1] = interim;
                    move = true;
                }
            }
            if (move == false) {
                break round;
            }
            System.out.print("µ⁄" + i + "¥Œ≈≈–Ú");
            inputArray(array);
        }
    }

    private static void inputArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}
