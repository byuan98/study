package code;

import java.util.*;

public class ScoreGrade {
//	使用switch根据成绩判断等级：不及格 及格 良好 优秀
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要进行等级判断的成绩(0-100):");
        double score = input.nextDouble();
        String grade = grade(score); // 使用一个String类型的变量来接受方法返回的结果
        if (grade != null) { // 如果返回值不为null,则说明分数输入正确,直接输出即可
            System.out.println(score + "分的等级为:" + grade);
        } else { // 反之说明分数输入不正确,那就进行提示
            System.out.println("您输入的成绩有误,成绩的范围应在0-100之间");
        }

    }

    private static String grade(double score) {
        if (score >= 0 && score <= 100) { // 分数的范围应在0-100之间
            switch ((int) score / 10) { // 因为switch的参数只能是整型,String,枚举,而score是double,所以先进行类型转换
            case 10: // score/10可得出分数的十位,根据分数的10位进行判断,大大减少了case子句的数量
            case 9:
                return "优秀";
            case 8:
            case 7:
                return "良好";
            case 6:
                return "及格";
            default:
                return "不及格";
            }
        }
        return null; // 如果之间的分支没有执行则说明分数输入有误,此时直接返回null
    }
}
