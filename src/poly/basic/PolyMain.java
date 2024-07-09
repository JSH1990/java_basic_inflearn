package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모변수가 자식인스턴스 참조 (다형적 참조)
        System.out.println("parent -> child");
        Parent poly = new Child();
        poly.parentMethod();

//        //자식은 부모를 담을수없다
//        Child poly = new Parent();


    }
}
