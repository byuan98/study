package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class TestTwo {
//  SimpleDateFormat��
    public static void main(String[] args) throws ParseException {
        // ׼��ģʽ--ָ���ַ����ĸ�ʽ
        String pattern = "yyyy-MM-dd E HH:mm:ss";
        // �������ڸ�ʽ������
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = new Date();
        // ��ʽ��
        String str = sdf.format(date);
        System.out.println(str);
        // ����
        str = "2021-01-26 ���ڶ� 14:01:07";
        date = sdf.parse(str);// Unhandled exception type ParseException
        System.out.println(date.toLocaleString());

    }
}
