package job;

public class GetStringMaxInt {
//	дһ������static int  getInt(String s);��ȡ�����ַ������������ֶ�Ӧ�����������
//	"ab1hy75tr0"----7510
    public static void main(String[] args) {
        System.out.println(getInt("ab1hy75tr0"));
        System.out.println(getInt("99yyy7tt4vgf###d0"));

    }

    static int getInt(String s) {
        String sCopyInt = "";
        int toIntMax = 0;
        for (int index = 0; index < s.length(); index++) { // ��ȡ���ַ����е���������
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                sCopyInt += s.charAt(index);
            }
        }
        char[] arrayInt = sCopyInt.toCharArray(); // ��ȡ�����ַ���ת��Ϊ����,�Ӵ�С��������

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
