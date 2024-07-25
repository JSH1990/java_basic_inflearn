package lang.string.wrapper;

public class AutoMain {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        int unboxedValue = boxedValue.intValue();
        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
