package code;

import java.util.*;

public class Title5 {
//	���������������Ƕ������ɴ��⣺
//	ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ,60-89��֮�����B��ʾ,60�����µ���C��ʾ;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        char level;
        level = score >= 90 ? 'A' : (score < 60 ? 'C' : 'B');
        System.out.println(level);

    }

}
