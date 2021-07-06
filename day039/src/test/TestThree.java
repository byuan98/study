package test;

import java.io.UnsupportedEncodingException;

public class TestThree {

    public static void main(String[] args) throws UnsupportedEncodingException {

        toEncode();
    }

    public static void toEncode() throws UnsupportedEncodingException {
        String str = new String(new byte[] { 92, 96, 98 }, "gbk");
        System.out.println(str);
    }
}
