package com.godfery.test;

public class TestThree {
    public static void main(String[] args) {
        Integer rowCount = 9;
        Integer[] a = { 7, 5, 3, 1 };
        String photo = "*";
        for (Integer rowNow = 0; rowNow < 4; rowNow++) {
            for (Integer spaceNumber = 0; spaceNumber < 4 - rowNow; spaceNumber++) {
                System.out.print("   ");
            }
            for (Integer starNumber = 0; starNumber <= rowNow * 2; starNumber++) {
                if (rowNow == 0) {
                    System.out.print("");
                } else {
                    System.out.print(" " + photo + " ");
                }

            }
            for (Integer aa = 0; aa < a[rowNow]; aa++) {
                System.out.print("   ");
            }
            for (Integer starNumber = 0; starNumber <= rowNow * 2; starNumber++) {
                if (rowNow == 0) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + photo + " ");
                }
            }
            System.out.println();
        }

        for (Integer rowNow = 0; rowNow < rowCount; rowNow++) {
            Integer spaceNumber;
            for (spaceNumber = 0; spaceNumber < rowNow; spaceNumber++) { // 打印空格
                System.out.print("   ");
            }
            for (Integer starNumber = 0; starNumber < 2 * (rowCount - rowNow) - 1; starNumber++) {
                if (spaceNumber == 0 && (starNumber == 0 || starNumber == 2 * (rowCount - rowNow) - 2)) {
                    System.out.print("   ");
                } else {
                    System.out.print(" " + photo + " ");
                }
            }
            System.out.println();
        }
    }
}
