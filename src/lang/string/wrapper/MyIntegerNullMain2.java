package lang.string.wrapper;

public class MyIntegerNullMain2 {
    public static void main(String[] args) {
        MyInteger[] inArray = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(inArray, -1));
        System.out.println(findValue(inArray, 0));
        System.out.println(findValue(inArray, 1));
        System.out.println(findValue(inArray, 100));
    }

    private static MyInteger findValue(MyInteger[] inArray, int target) {
        for(MyInteger myInteger : inArray){
            if(myInteger.getValue() == target){
                System.out.println(myInteger.getValue());
                return myInteger;
            }
        }return null;
    }
}
