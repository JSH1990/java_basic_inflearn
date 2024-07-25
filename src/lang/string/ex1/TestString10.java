package lang.string.ex1;

public class TestString10 {
    public static void main(String[] args) {
        String fruit = "apple,banana,orange";

        String[] split = fruit.split(",");
        for (String split1 : split){
        System.out.println(split1);
    }

        String joinString = String.join("dd", split);
        System.out.println(joinString);
}
}