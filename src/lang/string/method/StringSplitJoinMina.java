package lang.string.method;

public class StringSplitJoinMina {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        System.out.println(String.join("-", str.split(",")));


    }
}
