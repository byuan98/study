package job;

import java.util.*;

public class SensitiveWordFiltering {
//	��д���дʹ��˳���
//	����������У��������ҡ���������ȣ�
//	������Ҫ��һЩ�û����ύ�����������е������Դ�����й��ˡ�
//	�硰�ԡ�����ɫ�顱������ը�������ֲ�������ǹ���ȣ�
//	��Щ�������������Ͻ��д�������Ҫ���˵����������������滻����
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sensitiveWord = { "��", "ɫ��", "��ը", "�ֲ�", "ǹ" };
        System.out.println("����������Ҫ����ľ���");

        String words = input.next();

        for (int index = 0; index < sensitiveWord.length; index++) {
            words = words.replace(sensitiveWord[index], "*");
        }
        System.out.println(words);

    }

}
