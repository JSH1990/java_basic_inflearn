package lang.string;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello World";
        String string = new StringBuilder(str).reverse().toString();
        System.out.println(string);
    }
}
