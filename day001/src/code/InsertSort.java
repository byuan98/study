package code;

public class InsertSort {

    public static void main(String args[]) {
        int[] array = { 3, 1, 4, 6, 5, 9, 8, 7 };
        for (int i = 1; i < array.length; i++) {
            int interem = array[i];// 如果不存放array[i]的值的话,如果array[j]向后移动的话,会把原来的array[i]的值顶掉
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > interem) {
                    array[j + 1] = array[j];// 后面的一个等于前面的那个,往后移动一个位置
                } else {
                    break;// 因为之前的数组的元素是有序的,当if不成立时,代表着该元素当前的位置是合适的,无需整体后移
                }
            }
            array[j + 1] = interem;// 因为第10行的j--,所以这里的j和我们比较的j是有误差的,+1是为了消除这一误差
            // 如果上面执行了break,第9行,int j=i-1;现在的j+1等于把减去的加回来,一减一加等于不变,等于还取了个i的值,本身等于本身,值等于没变
        }
        arrayInput(array);
    }

    private static void arrayInput(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
