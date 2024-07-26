package enumeration.test;

/*
AuthGradeMain2 클래스에 코드를 작성하자
인증 등급을 받아서, 앞서 만든 AuthGrade 열거형으로 변환하자
인증 등급에 따라 접근할수있는 화면이 다르다.
 - 예를 들어 GUEST 등급은 메인화면만 접근할 수 있고, ADMIN 등급은 모든 화면에 접근할수 있다.
 - 각각의 등급에 따라서 출력되는 메뉴 목록이 달라진다.

 GUEST 입력 예
 당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]: GUEST
 당신의 등급은 손님입니다.
 == 메뉴목록 ==
 - 메인화면

 LOGIN 입력 예
 당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]: LOGIN
 당신의 등급은 로그인 회원 입니다.
 == 메뉴목록 ==
 - 메인화면
 - 이메일 관리 화면

 ADMIN 입력 예
  당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]: ADMIN
 당신의 등급은 관리자 입니다.
 == 메뉴목록 ==
 - 메인화면
 - 이메일 관리 화면
 - 관리자 화면

 잘못된 값이 입력되는 경우
   예외 발생 IllegalArgumentException

#참고 - Enum.valueOf()를 사용할때 잘못된 값이 입력되면 예와 같이 IllegalArgumentException 예외가 발생한다.
 */

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 등급을 선택하세요 [GUEST, LOGIN, ADMIN]");
        String input = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(input.toUpperCase()); //소문자로 입력해도 대문자로 변환
        try {
            System.out.println(authGrade);
            System.out.println("==메뉴목록==");
        }catch (Exception e) {
            System.out.println(e);
        }


        switch (authGrade){
            case GUEST:
                System.out.println("메인화면");

            case LOGIN:
                System.out.println("메인화면");
                System.out.println("이메일 관리 화면");


                case ADMIN:
                    System.out.println("메인화면");
                    System.out.println("이메일 관리 화면");
                    System.out.println("관리자 화면");
        }











//        if(input.equals(GUEST.getDescription())){
//            System.out.println("손님 입니다.");
//            GUEST.funtion();
//        }else if(input.equals(LOGIN.getDescription())){
//            System.out.println("로그인 회원 입니다.");
//            LOGIN.funtion();
//        }else if(input.equals(ADMIN.getDescription())){
//            System.out.println("관리자 입니다.");
//            ADMIN.funtion();
//        }else{
//            System.out.println("예외처리");
//        }



    }
}
