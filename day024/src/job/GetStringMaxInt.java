package job;

public class GetStringMaxInt {
//	写一个方法static int  getInt(String s);获取参数字符串中所有数字对应的最大整数：
//	"ab1hy75tr0"----7510
    public static void main(String[] args) {
        System.out.println(getInt("ab1hy75tr0"));
        System.out.println(getInt("99yyy7tt4vgf###d0"));

    }

    static int getInt(String s) {
        String sCopyInt = "";
        int toIntMax = 0;
        for (int index = 0; index < s.length(); index++) { // 先取出字符串中的所有数字
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                sCopyInt += s.charAt(index);
            }
        }
        char[] arrayInt = sCopyInt.toCharArray(); // 将取出的字符串转换为数字,从大到小进行排序

        arraySort(arrayInt);

        for (int charIndex = 0; charIndex < arrayInt.length; charIndex++) {
            toIntMax += (arrayInt[charIndex] - '0') * (Math.pow(10, arrayInt.length - charIndex - 1));
        }

        return toIntMax;
    }

    static void arraySort(char[] array) {
        char temporary;
        for (int indexLow = 0; indexLow < array.length; indexLow++) {
            for (int indexHigh = 0; indexHigh < array.length; indexHigh++) {
                if (array[indexLow] > array[indexHigh]) {
                    temporary = array[indexLow];
                    array[indexLow] = array[indexHigh];
                    array[indexHigh] = temporary;
                }
            }
        }
    }

    static void inputArray(char[] array) {
        for (char element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
