package fianl1;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("test", "test1");
        member.print();
        member.changeData("test1", "test1-1");
        member.print();
    }
}
