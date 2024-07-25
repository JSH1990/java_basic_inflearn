package lang.string.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Double doubleObj = Double.valueOf(10.0);


        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        System.out.println(newInteger);
        System.out.println(integerObj);

        System.out.println((newInteger.equals(integerObj)));
    }
}
