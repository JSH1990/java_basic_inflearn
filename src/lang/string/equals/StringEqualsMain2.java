package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교" + (str1 == str2));
        System.out.println("new String() == equlsa 비교" + (str1.equals(str2)));


    }

    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
