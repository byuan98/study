package code;

public class BinHexOctDemo {
//����ת��Demo ��ʮ����תʮ������Ϊ��
    public static void main(String[] args) {
        System.out.println(binHexOct16(1998));

    }

    public static String binHexOct16(int number) {
        // ����һ���ַ�����,��16���Ƶ������ַ�ȫ��װ��ȥ
        char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        // ��Ž��
        String result = "";

        // ֻҪnumber������0��һֱѭ��
        while (number != 0) {
            // ��ȡn��m����,ѭ����n��m,�ٳ�m,ֱ��0
            // �����߼��õ��Ľ����Ҫ���ſ�,��������ʹ�������ַ�����ƴ��,
            // ��ÿ�λ�õĽ���ŵ����н��֮ǰ
            result = array[number % 16] + result;
            number /= 16;
        }
        return result;
    }
}