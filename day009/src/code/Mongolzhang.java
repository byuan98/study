package code;

public class Mongolzhang {
//���д�
    public static void main(String[] args) {
        String[] wordPass = { "��", "ɫ��", "��ը", "�ֲ�", "ǹ", "С��ά��" };
        String sentence = "С��ά�����Ӻܼ�����ȼ�ױ�ը�����죬������һ��ǹ��ͼ��ɫ�鳡�����пֲ�Ϯ����";
        for (int index = 0; index < wordPass.length; index++) {
            sentence = sentence.replace(wordPass[index], "*");
        }
        System.out.println(sentence);
    }
}
