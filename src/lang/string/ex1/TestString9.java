package lang.string.ex1;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hwe@mm";

        String[] part = email.split("@");
        String idPart = part[0];
        String name = part[1];

        System.out.println(idPart);
        System.out.println(name);
    }
}
