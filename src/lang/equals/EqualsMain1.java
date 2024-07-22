package lang.equals;

public class EqualsMain1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("iden= " + (userV1 == userV2));
        System.out.println("equl= " + (userV2.equals(userV1)));
    }
}
