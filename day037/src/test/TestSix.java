package test;

public class TestSix {

    public static void main(String[] args) {
        Money m = new Money();
        String monry = m.PositiveIntegerToHanStr("10000000000");
        System.out.println(monry);
    }

}

class Money {
    private String HanDigiStr[] = new String[] { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��" };
    private String HanDiviStr[] = new String[] { "", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ", "��", "ʰ",
            "��", "Ǫ", "��", "ʰ", "��", "Ǫ", "��", "ʰ", "��", "Ǫ" };

    /**
     * @param NumStr �����ַ���������������ֻ����ǰ���ո�(�����Ҷ���)��������ǰ����
     * @return
     */
    String PositiveIntegerToHanStr(String NumStr) {
        String RMBStr = "";
        boolean lastzero = false;
        boolean hasvalue = false; // �ڡ����λǰ����ֵ���
        int len, n;
        len = NumStr.length();
        if (len > 15)
            return "��ֵ����!";
        for (int i = len - 1; i >= 0; i--) {
            if (NumStr.charAt(len - i - 1) == ' ')
                continue;
            n = NumStr.charAt(len - i - 1) - '0';
            if (n < 0 || n > 9)
                return "���뺬�������ַ�!";

            if (n != 0) {
                if (lastzero)
                    RMBStr += HanDigiStr[0]; // ���������������ֵ��ֻ��ʾһ����
                // ��������ǰ���㲻��������
                // if( !( n==1 && (i%4)==1 && (lastzero || i==len-1) ) ) //
                // ��ʮ��λǰ����Ҳ����Ҽ���ô���
                if (!(n == 1 && (i % 4) == 1 && i == len - 1)) // ʮ��λ���ڵ�һλ����Ҽ��
                    RMBStr += HanDigiStr[n];
                RMBStr += HanDiviStr[i]; // ����ֵ��ӽ�λ����λΪ��
                hasvalue = true; // �����λǰ��ֵ���

            } else {
                if ((i % 8) == 0 || ((i % 8) == 4 && hasvalue)) // ����֮������з���ֵ����ʾ��
                    RMBStr += HanDiviStr[i]; // ���ڡ�����
            }
            if (i % 8 == 0)
                hasvalue = false; // ���λǰ��ֵ��Ƿ��ڸ�λ
            lastzero = (n == 0) && (i % 4 != 0);
        }

        if (RMBStr.length() == 0)
            return HanDigiStr[0]; // ������ַ���"0"������"��"
        return RMBStr;
    }
}