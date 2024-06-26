package contruct;

public class MemberInitMain {
    public static void main(String[] args) {
        Member m1 = new Member("m1", 20);
        Member m2 = new Member("m2", 22);

        Member[] members = {m1, m2};

        for (Member member : members) {
            System.out.println("이름 : " + member.name + "나이 : " + member.age);
        }
    }
}
