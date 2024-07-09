package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super();
        System.out.println("Classb " + a);
    }
    public ClassB(int a, int b) {
        super();
        System.out.println("classb 생성자 a = " + a + ", b = " + b);
    }
}
