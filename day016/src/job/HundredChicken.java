package job;

public class HundredChicken {
//	“百钱买百鸡” 是我国古代的著名数学题。
//	   题目这样描述：
//	   3 文钱可以买1只公鸡，
//	   2 文钱可以买一只母鸡，
//	   1 文钱可以买3 只小鸡。
//	   用100 文钱买100 只鸡，那么各有公鸡、母鸡、小鸡多少只
    public static void main(String[] args) { // 本题使用穷举法
        for (int roosterNumber = 0; roosterNumber <= 33; roosterNumber++) { // 如果100文全部买公鸡最多可以买33只
            for (int henNumber = 0; henNumber <= 50; henNumber++) { // 如果100文全部买母鸡最多可以买50只
                for (int chickenNumber = 0; chickenNumber <= 100; chickenNumber += 3) { // 一百文最多可以买300只小鸡,但根据题意,鸡的数量最多为100,故取值100,又因三只小鸡一文钱,故将3只小鸡作为一个单位,小鸡的数量从3开始,+=3
                    if ((roosterNumber + henNumber + chickenNumber == 100)
                            && (roosterNumber * 3 + henNumber * 2 + chickenNumber / 3) == 100) { // 如果三种鸡同时满足:鸡的总数加起来是100,鸡的价钱加起来是100,则符合要求并输出
                        System.out.println(
                                "100文钱买100只鸡,各有公鸡" + roosterNumber + "只,母鸡" + henNumber + "只,小鸡" + chickenNumber + "只");
                    }
                }
            }
        }

    }

}
