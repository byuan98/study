package job;

public class FormatMoney {
//  дһ������ʵ��Ǯ����ת���� �� 111034  Ϊʮһ��һǧ����ʮ��Ԫ
    public static void main(String[] args) {
        toMoney(10212);
        toMoney(10202);
        toMoney(111034);
        toMoney(100000);
        toMoney(1010001);
        toMoney(1010101);
        toMoney(1);
    }

    private static String toMoney(Integer number) {
        String[] format = { "��", "ǧ", "��", "ʮ", "��", "ǧ", "��", "ʮ", "Ԫ" };
        String money = toBig(number);
        String mCopy = "";
        boolean flag = false;
        for (int index = money.length() - 1, indexFormat = format.length - 1; index >= 0
                && indexFormat >= 0; index--, indexFormat--) {
            if (money.charAt(index) == '��') {
                if (flag) {
                    continue;
                }
                mCopy = "��" + mCopy;
                flag = true;
                continue;
            }
            flag = false;
            mCopy = money.charAt(index) + format[indexFormat] + mCopy;
        }
        System.out.println(mCopy);
        return null;
    }

    private static String toBig(Integer number) {
        String big = "��һ�����������߰˾�";
        String money = number.toString();
        String d = "";
        char[] a = money.toCharArray();
        for (int index = 0; index < a.length; index++) {
            d += big.charAt(a[index] - '0');
        }
        return d;
    }
}
