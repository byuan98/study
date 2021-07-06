package test;

import java.util.*;

public class TestOne {
//  switch
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        switch (number) {

        case 1:
            System.out.println("1");
        default:
            System.out.println("4");
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");

        }

    }

}
