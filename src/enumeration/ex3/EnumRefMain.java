package enumeration.ex3;

import static enumeration.ex3.Grade.BASIC;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println(BASIC);
        System.out.println(ref(BASIC));
    }

    private static String ref(Grade grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
