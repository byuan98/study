package job;

import java.util.*;

public class BlackHoleNumber {
//	已知：一个任意的四位正整数。
//	将数字重新组合成一个最大的数和最小的数相减，
//	重复这个过程，最多七步，必得6174。
//	即：7641-1467=6174。将永远出不来。
//	写一个方法打印所有四位数数字（全相同的除外）均能得到6174。
//	输出掉进黑洞的步数。
    public static void main(String[] args) {
        System.out.println("请输入一个四位正整数：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int step = 0;
        if (identicalJudge(number)) { // 先判断这个数是否四位相同,相同则直接返回
            System.out.println("四位相同的数无法掉入黑洞");
        } else {
            while (true) {
                int[] array = numberInArray(number); // 将数字转为数组,方便组合
                arraySort(array); // 将数组降序排列
                int numberMax = array[0] * 1000 + array[1] * 100 + array[2] * 10 + array[3]; // 排序后的数组顺序取出组合,得到一个最大数
                int numberMin = array[3] * 1000 + array[2] * 100 + array[1] * 10 + array[0]; // 排序后的数组顺序取出组合,得到一个最小数
                System.out.println(numberMax + "-" + numberMin + "=" + (numberMax - numberMin));
                number = numberMax - numberMin;
                step++; // 完成以上步骤,步数+1
                if (number == 6174) { // 当这个数等于6174,则掉入黑洞
                    System.out.println("共走了" + step + "步,掉入了黑洞");
                    break;
                }
            }
        }
    }

    private static boolean identicalJudge(int number) {
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundreds = number / 100 % 10;
        int thousand = number / 1000 % 10;
        if (unit == decade && unit == hundreds && unit == thousand) {
            return true;
        }
        return false;
    }

    private static int[] numberInArray(int number) { // 四位数字转数组
        if (number < 1000 && number > 9999) {
            System.out.println("您输入的数字不是一个四位数,请核对后再次输入");
            return null;
        }
        int unit = number / 1 % 10;
        int decade = number / 10 % 10;
        int hundreds = number / 100 % 10;
        int thousand = number / 1000 % 10;
        return new int[] { unit, decade, hundreds, thousand };
    }

    private static void arraySort(int[] array) { // 数组的降序排列
        int interim;
        for (int low = 0; low < array.length; low++) {
            for (int high = low + 1; high < array.length; high++) {
                if (array[low] < array[high]) {
                    interim = array[low];
                    array[low] = array[high];
                    array[high] = interim;
                }
            }
        }
    }
}
