package code;

public class ThrowableRecurrent {
//�����쳣���󼰸���
    public static void main(String[] args) {

    }

}

//�쳣��ϵ���㸸��:Throwable
class ThrowableTest {

}

//Throwable-->Error
//�쳣��ϵ���㸸��Throwable������֮һ:Error
class ErrorTest extends ThrowableTest {

}

//Throwable-->Exception
//�쳣��ϵ���㸸��Throwable������֮��:Exception
class ExceptionTest extends ThrowableTest {

}

//Throwable-->ExceptionTest-->RuntimeException
//Exception�ڶ���������Ϊ�����һ��:RuntimeException
class RuntimeExceptionTest extends ExceptionTest {

}