package lang.string.wrapper;

public class MyIntergerMethod1 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compare(value, 5);
        int i2 = compare(value, 10);
        int i3 = compare(value, 20);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

    public static int compare(int value, int target) {
        if (value < target) {
            return -1;
        }else if (value > target) {
            return 1;
        }else {
            return 0;
        }
    }
}
