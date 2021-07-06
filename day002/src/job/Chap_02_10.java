package job;

public class Chap_02_10 {

    public static void main(String[] args) {
        for (int multiplierA = 1; multiplierA <= 9; multiplierA++) {
            for (int multiplierB = 1; multiplierB <= multiplierA; multiplierB++) {
                System.out.print(multiplierB + "*" + multiplierA + "=" + multiplierA * multiplierB + "\t");
            }
            System.out.println();
        }
    }
}
