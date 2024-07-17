package poly.ex4.ex3;

/*
문제2. 결제 시스템 개발
여러분은 기대하던 결제 시스템 개발팀에 입사하게 되었다.
이 팀은 현재 2가지 결제 수단을 지원한다. 앞으로 5개의 결제 수단을 추가로 지원할 예정이다.
새로운 결제 수단을 쉽게 추가 할 수 있도록, 기존 코드를 리펙토링해라.

요구사항
1. OCP 원칙을 지키세요
2. 메서드를 포함한 모든 코드를 변경해도 됩니다. 클래스나 인터페이스를 추가해도 됩니다.
3. 단 프로그램을 실행하는 PlayMain0 코드는 변경하지 않고, 그대로 유지해야 합니다.
4. 리펙토링 후에도 실행 결과는 기존과 같아야 합니다.

이 문제에 정답은 없습니다.
새로운 결제 수단을 추가했을때, Pay를 사용하는 클라이언트 코드인 PayService의 변경을 최소화 할수있다면 성공입니다.
 */
public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //네이버 결제
        String payOption2 = "naver";
        int amount2 = 1000;
        payService.processPay(payOption2, amount2);

//        //잘못된 결제 수단 선택
//        String payOption3 = "bad";
//        int amount3 = 15000;
//        payService.processPay(payOption3, amount1);

    }


}
