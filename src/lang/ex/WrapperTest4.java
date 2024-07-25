package lang.ex;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        System.out.println(integer1);

        int intValue = Integer.valueOf(str);
    }
}
