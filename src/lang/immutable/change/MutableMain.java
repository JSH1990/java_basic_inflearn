package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {

        Mutableobj obj = new Mutableobj(10);
        obj.add(20);
        System.out.println(obj.getValue());
    }
}
