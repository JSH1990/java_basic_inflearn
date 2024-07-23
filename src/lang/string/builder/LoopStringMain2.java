package lang.string.builder;

public class LoopStringMain2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sp.append("hello java");
        }
        long endTime = System.currentTimeMillis();

        String result = sp.toString() ;
        System.out.println(result);
        System.out.println(endTime - startTime);
    }
}
