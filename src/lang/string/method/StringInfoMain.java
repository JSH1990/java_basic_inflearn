package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println("문자열이 비어 있거나 공백인지" + "".isBlank());

        char c = str.charAt(7);
        System.out.println(c);
    }
}
