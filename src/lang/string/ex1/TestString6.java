package lang.string.ex1;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println(index);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            System.out.println(index);
            count++;
        }
        System.out.println(count);
    }
}
