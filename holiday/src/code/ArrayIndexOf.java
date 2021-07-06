package code;

import java.util.*;

public class ArrayIndexOf {
//	写一个方法获:public static int indexOf(int[] arr,int n)
//    获取arr中第一次出现n的位置  如果arr中没有n 返回-1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        System.out.println("请输入需要在数组中查询的数字：");
        int n = input.nextInt();
        int index = indexOf(array, n);
        if (index != -1) {
            System.out.println(n + "在数组中第一次出现的下标为" + index);
        } else {
            System.out.println(n + "在数组中并未出现过");
        }
    }

    public static int indexOf(int[] arr, int n) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == n) {
                return index;
            }
        }
        return -1;
    }
}
