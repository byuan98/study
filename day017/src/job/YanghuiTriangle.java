package job;

import java.util.*;

public class YanghuiTriangle {
//	 使用二维数组  打印杨辉三角
//    1
//    1  1
//    1  2   1
//    1  3   3   1
//    1  4   6   4   1
//    1  5   10  10  5   1
//    1  6   15  20  15  6   1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("您想要构建几乘几的杨辉三角:");
        int number = input.nextInt();
        int[][] triangle = new int[number][number];
        triangle[0][0] = 1;
        for (int x = 1; x < triangle.length; x++) {
            for (int y = 0; y < triangle[x].length; y++) {
                if (x == y || y == 0) {
                    triangle[x][y] = 1;
                } else {
                    triangle[x][y] = triangle[x - 1][y] + triangle[x - 1][y - 1];
                }
            }
        }
        inputTriangle(triangle);

    }

    private static void inputTriangle(int[][] triangle) {
        for (int x = 0; x < triangle.length; x++) {
            for (int y = 0; y < triangle.length; y++) {
                if (triangle[x][y] == 0) {
                    continue;
                } else {
                    System.out.print(triangle[x][y] + "\t");
                }
            }
            System.out.println();
        }
    }
}
