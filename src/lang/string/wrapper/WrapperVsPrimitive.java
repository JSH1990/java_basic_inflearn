package lang.string.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        Long sunWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sunWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sunWrapper);
        System.out.println((endTime - startTime));


    }
}
