package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모변수가 자식 인스턴스 참조
        Parent poly = new Child();

        Child child = (Child) poly;
        child.childMethod();
    }
}
