package lang.math;

import java.util.Random;

public class RadomMain {
    public static void main(String[] args) {
        Random random = new Random(1);
        int randomInt = random.nextInt();
        System.out.println(randomInt);

        int ramdomRange1 = random.nextInt(10);
        System.out.println(ramdomRange1);


    }
}
