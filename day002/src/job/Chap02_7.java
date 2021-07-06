package job;

public class Chap02_7 {

    public static void main(String[] args) {
        for (int manNumber = 0; manNumber <= 9; manNumber++) {
            for (int womanNumber = 0; womanNumber <= 12; womanNumber++) {
                for (int kid = 0; kid <= 72; kid += 2) {
                    if (manNumber + womanNumber + kid == 36 && manNumber * 4 + womanNumber * 3 + kid / 2 == 36) {
                        System.out.println("一次全搬完，需要男" + manNumber + "人，女" + womanNumber + "人，小孩" + kid + "人");
                    }
                }
            }
        }
    }
}
