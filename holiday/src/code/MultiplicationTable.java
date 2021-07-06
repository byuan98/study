package code;

public class MultiplicationTable {
//	打印4个方向的99乘法表
    public static void main(String[] args) {
        tableDownLeft();
        tableTopLeft();
        tableTopRight();
        tableDownRight();

    }

//  九九乘法表的打印需要使用双层循环结构来完成,
//	循环初始值的取值与条件判断(何时补充空格)决定了九九乘法表的方向
//	不论方向如何,九九乘法表两直角边终点始终为1*1和9*9,根据这一特性我们可以确定外层循环与内层循环的初始值
//	位置靠左的乘法表无需判定何时加入空格,而右边的乘法表则需要借助分支结构来判定何时增加空格
    private static void tableDownLeft() { // 九九乘法表左下
        for (int factorA = 1; factorA <= 9; factorA++) {
            for (int factorB = 1; factorB <= factorA; factorB++) {
                System.out.print(factorB + "*" + factorA + "=" + factorA * factorB + "\t");
            }
            System.out.println();
        }
    }

    private static void tableTopLeft() { // 九九乘法表左上
        for (int factorA = 9; factorA >= 1; factorA--) {
            for (int factorB = 1; factorB <= factorA; factorB++) {
                System.out.print(factorB + "*" + factorA + "=" + factorA * factorB + "\t");
            }
            System.out.println();
        }
    }

    private static void tableTopRight() { // 九九乘法表右上
        for (int factorA = 9; factorA >= 1; factorA--) {
            for (int factorB = 9; factorB >= 1; factorB--) {
                if (factorA >= factorB) { // 如果第一个乘数大于或等于第二个乘数,则输出公式
                    System.out.print(factorB + "*" + factorA + "=" + factorA * factorB + "\t");
                } else { // 反之输出制表符补位,以达到整体靠右的结果
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    private static void tableDownRight() { // 九九乘法表右下
        for (int factorA = 1; factorA <= 9; factorA++) {
            for (int factorB = 9; factorB >= 1; factorB--) {
                if (factorA >= factorB) {
                    System.out.print(factorB + "*" + factorA + "=" + factorA * factorB + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
