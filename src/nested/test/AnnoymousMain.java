package nested.test;

public class AnnoymousMain {
    public static void main(String[] args) {
        //정적 중첩 클래스
        //내부 클래스
        //지역 클래스
        //익명 클래스

        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello World");
            }
        };

        hello.hello();
    }
}
