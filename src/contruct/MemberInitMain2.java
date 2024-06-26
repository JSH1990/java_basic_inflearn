package contruct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();

        MemberInit member2 = new MemberInit();

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println(member.name + " " + member.age + " " + member.grade );
        }
    }


}
