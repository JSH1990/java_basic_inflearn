package lang.string.method;

import poly.ex6.SoundFlyMain;

public class StringCompareMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java! Welcome to Java World";
        System.out.println(str1.contains("Java"));
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.indexOf("Java", 10));
    }
}
