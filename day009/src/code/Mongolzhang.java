package code;

public class Mongolzhang {
//敏感词
    public static void main(String[] args) {
        String[] wordPass = { "性", "色情", "爆炸", "恐怖", "枪", "小熊维尼" };
        String sentence = "小熊维尼性子很急，易燃易爆炸；这天，他拿了一把枪企图对色情场所进行恐怖袭击，";
        for (int index = 0; index < wordPass.length; index++) {
            sentence = sentence.replace(wordPass[index], "*");
        }
        System.out.println(sentence);
    }
}
