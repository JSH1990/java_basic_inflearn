package poly.overriding;

public class OverridngMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child -> child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("parent -> parent");
        System.out.println("value = " + parent.value);
        parent.method();
    }
}
