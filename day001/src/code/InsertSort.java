package code;

public class InsertSort {

    public static void main(String args[]) {
        int[] array = { 3, 1, 4, 6, 5, 9, 8, 7 };
        for (int i = 1; i < array.length; i++) {
            int interem = array[i];// ��������array[i]��ֵ�Ļ�,���array[j]����ƶ��Ļ�,���ԭ����array[i]��ֵ����
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > interem) {
                    array[j + 1] = array[j];// �����һ������ǰ����Ǹ�,�����ƶ�һ��λ��
                } else {
                    break;// ��Ϊ֮ǰ�������Ԫ���������,��if������ʱ,�����Ÿ�Ԫ�ص�ǰ��λ���Ǻ��ʵ�,�����������
                }
            }
            array[j + 1] = interem;// ��Ϊ��10�е�j--,���������j�����ǱȽϵ�j��������,+1��Ϊ��������һ���
            // �������ִ����break,��9��,int j=i-1;���ڵ�j+1���ڰѼ�ȥ�ļӻ���,һ��һ�ӵ��ڲ���,���ڻ�ȡ�˸�i��ֵ,������ڱ���,ֵ����û��
        }
        arrayInput(array);
    }

    private static void arrayInput(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
