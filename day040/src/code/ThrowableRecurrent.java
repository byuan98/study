package code;

public class ThrowableRecurrent {
//常见异常错误及复现
    public static void main(String[] args) {

    }

}

//异常体系顶层父类:Throwable
class ThrowableTest {

}

//Throwable-->Error
//异常体系顶层父类Throwable的子类之一:Error
class ErrorTest extends ThrowableTest {

}

//Throwable-->Exception
//异常体系顶层父类Throwable的子类之二:Exception
class ExceptionTest extends ThrowableTest {

}

//Throwable-->ExceptionTest-->RuntimeException
//Exception众多子类中最为特殊的一类:RuntimeException
class RuntimeExceptionTest extends ExceptionTest {

}