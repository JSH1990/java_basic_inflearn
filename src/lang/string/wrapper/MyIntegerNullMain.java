package lang.string.wrapper;

public class MyIntegerNullMain {
    public static void main(String[] args) {
        int[] inArray = { -1, 0, 1, 2, 3};
        System.out.println(findValue(inArray, -1));
        System.out.println(findValue(inArray, 0));
        System.out.println(findValue(inArray, 100));
    }

    private static int findValue(int[] inArray, int taget) {
        for(int value : inArray){
            if(value == taget){
                return value;
            }
        }return -1;
    }
}
