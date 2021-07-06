package cn.godfery.text;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer resultNumber=(int)(Math.random()*100+1);
        while(true) {
            System.out.print("Please enter a number:");
            Integer myNumber=scanner.nextInt();
            if(myNumber==resultNumber) {
                System.out.println("bingo");
                break;
            }
            System.out.println(myNumber>resultNumber?"So big":"So small");
        }
    }
}
