package job;

public class Diamond {
//	 ��ʹ��forѭ�� ��ӡһ��9�е�ʵ������
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *	 
    public static void main(String[] args) {
        int lineNumber = 9;
        for (int line = 1; line <= 5; line++) {
            for (int spaceNumber = 0; spaceNumber < (lineNumber / 2 + 1) - line; spaceNumber++) {
                System.out.print(" ");
            }
            for (int starNumber = 0; starNumber < line * 2 - 1; starNumber++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int line = 1; line <= 4; line++) {
            for (int spaceNumber = 0; spaceNumber < line; spaceNumber++) {
                System.out.print(" ");
            }
            for (int starNumber = 0; starNumber < (5 - line) * 2 - 1; starNumber++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
