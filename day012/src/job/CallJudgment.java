package job;

import java.util.*;

public class CallJudgment {
//	����������Ա� �жϳƺ���
//	С�к�  18 ˧��  35 ����  60үү
//	СŮ��       ��Ů        ����      ����
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("�����뱻�ƺ��ߵ��Ա�(��/Ů):");
        String sex = input.next();
        System.out.println("�����뱻�ƺ��ߵ�����(0��-150��):");
        int age = input.nextInt();
        String call = callJudement(sex, age); // ʹ��String���͵����������ܷ��صĳƺ�
        if (call != null) { // ����ƺ���Ϊ����˵���Ա������������ȷ,ֱ�ӽ���if�е������伴��
            System.out.println("Ӧ���ƺ�Ϊ" + call);
        } else {
            System.out.println("��������Ա����������,��˶Ժ��ٴ�����,�Ա�Ӧ��Ϊ�л�Ů,����Ӧ����0-150��֮��");
        }
    }

    private static String callJudement(int age, String sex) {
        // ͨ���ַ�����contains����������Ա�����ж�,�����Ļ����������������������˻������Զ��ܵõ����
        // ��ֹ����ͬʱ������Ů������,��������ʹ������contains����Ůֻ�ܴ���һ��
        if (sex.contains("��") == true && sex.contains("Ů") != true) {
            if (0 <= age && age <= 18) { // �����ڱ�0��С������
                return "С�к�";
            } else if (age <= 35) {
                return "˧��";
            } else if (age <= 60) {
                return "����";
            } else if (age <= 150) { // ��150��Ϊ����,��������������������Ӱ���ж�
                return "үү";
            }
        } else if (sex.contains("Ů") == true && sex.contains("��") != true) {
            if (0 <= age && age <= 18) { // �����ڱ�0��С������
                return "СŮ��";
            } else if (age <= 35) {
                return "��Ů";
            } else if (age <= 60) {
                return "����";
            } else if (age <= 150) {
                return "����";
            }
        }
        return null; // �������ķ�֧�ṹȫ��û�н�����˵������һ������,����null;
    }

    private static String callJudement(String sex, int age) {
        // ������ĳƺ��жϷ�����������,������������������ǰ�����Ա���ǰ���ܹ�ʹ��
        if (sex.contains("��") == true && sex.contains("Ů") != true) {
            if (0 <= age && age <= 18) { // �����ڱ�0��С������
                return "С�к�";
            } else if (age <= 35) {
                return "˧��";
            } else if (age <= 60) {
                return "����";
            } else if (age <= 150) { // ��150��Ϊ����,��������������������Ӱ���ж�
                return "үү";
            }
        } else if (sex.contains("Ů") == true && sex.contains("��") != true) {
            if (0 <= age && age <= 18) { // �����ڱ�0��С������
                return "СŮ��";
            } else if (age <= 35) {
                return "��Ů";
            } else if (age <= 60) {
                return "����";
            } else if (age <= 150) {
                return "����";
            }
        }
        return null; // �������ķ�֧�ṹȫ��û�н�����˵������һ������,����null;
    }
}
