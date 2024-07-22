package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj immutable1 = new ImmutableObj(10);
        ImmutableObj immutable2 = immutable1.add(20);

        System.out.println(immutable1.getValue());
        System.out.println(immutable2.getValue());
    }
}
