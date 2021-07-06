package job;

public class RectangleInputOne {
//	定义两个变量n和m(如n=5 m=6)打印如下效果的矩阵
//	1  2  3  4  5  6
//	12 11 10 9  8  7
//	13 14 15 16 17 18
//	24 23 22 21 20 19
//	25 26 27 28 29 30
    public static void main(String[] args) {
        rectangleInput(5, 6);
    }

    private static void rectangleInput(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 != 0) {
                    System.out.print(m * i + j - 6 + "\t");
                } else {
                    System.out.print(m * i - j + 1 + "\t");
                }
            }
            System.out.println();
        }
    }
}
