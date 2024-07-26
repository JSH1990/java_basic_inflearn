package enumeration.test;

import static enumeration.test.AuthGrade.*;

/*
AuthGrade는 클래스이다.
그안에 ADMIN은 AuthGrade는 클래스에서 만든 객체이다.
AuthGrade.values()는 객체주소를 반환한다.
그래서 for 반복문을 통해 , AuthGrade클래스 변수에 접근한다.

vl
*/
public class AuthGradeMain {
    public static void main(String[] args) {
//        System.out.println(GUEST);
//        System.out.println(LOGIN);
//        System.out.println(ADMIN);

        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println(value.name() + value.getDescription() + value.getValue());
        }


    }
}
