package code;

import java.util.*;

public class ArrayIndexOf {
//	дһ��������:public static int indexOf(int[] arr,int n)
//    ��ȡarr�е�һ�γ���n��λ��  ���arr��û��n ����-1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = { 1, 3, 5, 7, 9, 0, 8, 6, 4, 2 };
        System.out.println("��������Ҫ�������в�ѯ�����֣�");
        int n = input.nextInt();
        int index = indexOf(array, n);
        if (index != -1) {
            System.out.println(n + "�������е�һ�γ��ֵ��±�Ϊ" + index);
        } else {
            System.out.println(n + "�������в�δ���ֹ�");
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
