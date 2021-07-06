package code;

public class PrintArrayOne {
//	打印数组如下：
//	   {1,4,7,5,3}
//	   1 *
//	   4 * * * *
//	   7 * * * * * * *
//	   5 * * * * *
//	   3 * * *
    public static void main(String[] args) {
        // 每行的打印数量正好是其对应下标元素的值(均从0行开始)
        // 故,取出每个元素的值作为循环次数打印即可
        int[] array = { 1, 4, 7, 5, 3 };

        for (int element : array) {
            for (int number = 0; number < element; number++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }

    }

}
