package lang.clazz.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        long currentNano = System.nanoTime();
        System.out.println(currentNano);

        Map<String, String> getenved = System.getenv();
        System.out.println(getenved);

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        char[] originArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originArray, 0, copiedArray, 0, originArray.length);

        System.out.println(copiedArray);
        System.out.println(Arrays.toString(copiedArray));

    }
}
