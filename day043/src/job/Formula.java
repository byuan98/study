package job;

import java.util.*;
import java.io.*;

public class Formula {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Code\\Java\\study\\day43\\src\\job\\answer.txt");
        PrintWriter in = new PrintWriter(file);
        while (true) {
            System.out.println("Please enter a formula:");
            String stu = new Scanner(System.in).next();
            if (stu.endsWith("886")) {
                in.close();
                System.out.println("Game over");
                break;
            }
            in.write(stu + "\t\n");
            in.flush();
        }
    }
}
