package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        //정적중첩클래스와 다르게 이너클래스는 인스턴스 생성후 접근해야한다.

        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass innerClass = outer.new InnerClass();
        innerClass.hello();
    }
}
