package code;

import java.util.*;

public class ScoreGrade {
//	ʹ��switch���ݳɼ��жϵȼ��������� ���� ���� ����
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������Ҫ���еȼ��жϵĳɼ�(0-100):");
        double score = input.nextDouble();
        String grade = grade(score); // ʹ��һ��String���͵ı��������ܷ������صĽ��
        if (grade != null) { // �������ֵ��Ϊnull,��˵������������ȷ,ֱ���������
            System.out.println(score + "�ֵĵȼ�Ϊ:" + grade);
        } else { // ��֮˵���������벻��ȷ,�Ǿͽ�����ʾ
            System.out.println("������ĳɼ�����,�ɼ��ķ�ΧӦ��0-100֮��");
        }

    }

    private static String grade(double score) {
        if (score >= 0 && score <= 100) { // �����ķ�ΧӦ��0-100֮��
            switch ((int) score / 10) { // ��Ϊswitch�Ĳ���ֻ��������,String,ö��,��score��double,�����Ƚ�������ת��
            case 10: // score/10�ɵó�������ʮλ,���ݷ�����10λ�����ж�,��������case�Ӿ������
            case 9:
                return "����";
            case 8:
            case 7:
                return "����";
            case 6:
                return "����";
            default:
                return "������";
            }
        }
        return null; // ���֮��ķ�֧û��ִ����˵��������������,��ʱֱ�ӷ���null
    }
}
