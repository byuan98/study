package job;

import java.util.*;

public class CallJudgment {
//	根据年龄和性别 判断称呼：
//	小男孩  18 帅哥  35 叔叔  60爷爷
//	小女孩       美女        阿姨      奶奶
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入被称呼者的性别(男/女):");
        String sex = input.next();
        System.out.println("请输入被称呼者的年龄(0岁-150岁):");
        int age = input.nextInt();
        String call = callJudement(sex, age); // 使用String类型的数据来接受返回的称呼
        if (call != null) { // 如果称呼不为空则说明性别和年龄输入正确,直接进行if中的输出语句即可
            System.out.println("应被称呼为" + call);
        } else {
            System.out.println("您输入的性别或年龄有误,请核对后再次输入,性别应该为男或女,年龄应该在0-150岁之间");
        }
    }

    private static String callJudement(int age, String sex) {
        // 通过字符串的contains来对输入的性别进行判断,这样的话无论是输入男生还是男人或者男性都能得到结果
        // 防止有人同时输入男女两个字,所以我们使用两个contains让男女只能存在一个
        if (sex.contains("男") == true && sex.contains("女") != true) {
            if (0 <= age && age <= 18) { // 不存在比0还小的年龄
                return "小男孩";
            } else if (age <= 35) {
                return "帅哥";
            } else if (age <= 60) {
                return "叔叔";
            } else if (age <= 150) { // 以150岁为上限,避免有人输入更大的数字影响判断
                return "爷爷";
            }
        } else if (sex.contains("女") == true && sex.contains("男") != true) {
            if (0 <= age && age <= 18) { // 不存在比0还小的年龄
                return "小女孩";
            } else if (age <= 35) {
                return "美女";
            } else if (age <= 60) {
                return "阿姨";
            } else if (age <= 150) {
                return "奶奶";
            }
        }
        return null; // 如果上面的分支结构全部没有进行则说明参数一定有误,返回null;
    }

    private static String callJudement(String sex, int age) {
        // 对上面的称呼判断方法进行重载,调用者无论是年龄在前还是性别在前都能够使用
        if (sex.contains("男") == true && sex.contains("女") != true) {
            if (0 <= age && age <= 18) { // 不存在比0还小的年龄
                return "小男孩";
            } else if (age <= 35) {
                return "帅哥";
            } else if (age <= 60) {
                return "叔叔";
            } else if (age <= 150) { // 以150岁为上限,避免有人输入更大的数字影响判断
                return "爷爷";
            }
        } else if (sex.contains("女") == true && sex.contains("男") != true) {
            if (0 <= age && age <= 18) { // 不存在比0还小的年龄
                return "小女孩";
            } else if (age <= 35) {
                return "美女";
            } else if (age <= 60) {
                return "阿姨";
            } else if (age <= 150) {
                return "奶奶";
            }
        }
        return null; // 如果上面的分支结构全部没有进行则说明参数一定有误,返回null;
    }
}
