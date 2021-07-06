package job;

public class Chap02_8 {

    public static void main(String[] args) {
        for (int number = 1000; number <= 9999; number++) {
            int unit, decade, hundreds, kilobit;
            unit = number / 1 % 10;
            decade = number / 10 % 10;
            hundreds = number / 100 % 10;
            kilobit = number / 1000 % 10;
            if (((unit * 10 + decade) + (hundreds * 10 + kilobit))
                    * ((unit * 10 + decade) + (hundreds * 10 + kilobit)) == number) {
                System.out.println(number);
            }

        }

    }

}
