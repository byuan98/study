package job;

import java.util.*;

public class SensitiveWordFiltering {
//	编写敏感词过滤程序
//	在网络程序中，如聊天室、聊天软件等，
//	经常需要对一些用户所提交的聊天内容中的敏感性词语进行过滤。
//	如“性”、“色情”、“爆炸”、“恐怖”、“枪”等，
//	这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sensitiveWord = { "性", "色情", "爆炸", "恐怖", "枪" };
        System.out.println("请输入您所要输入的句子");

        String words = input.next();

        for (int index = 0; index < sensitiveWord.length; index++) {
            words = words.replace(sensitiveWord[index], "*");
        }
        System.out.println(words);

    }

}
