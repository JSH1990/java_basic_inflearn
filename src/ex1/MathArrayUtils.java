package ex1;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            total += value;

        }
        return total;

    }

    public static int sum1(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;

    }

    public static int average(int[] values) {
        return sum(values) / values.length;
    }


    public static int min(int[] values) {
        int minValue = values[0];
        for(int value : values) {
            if(value < minValue){
            minValue = value;
        }
    }
    return minValue;
    }
    }

