package poly.ex2;

/*
문제1. 다중 메세지 발송
한번에 여러곳에 메세지를 발송하는 프로그램을 개발하자.
다음 코드를 참고해서 클래서 완성하자.

요구사항
1. 다형성을 활용하세요
2. Sender 인터페이스를 사용하세요
3. EmailSender, SmsSender, FaceBookSender 를 구현하세요

실행결과
메세지를 발송합니다 : 환영합니다!
SMS를 발송합니다 : 환영합니다!
페이스북에 발송합니다 : 환영합니다!
 */

public class SendMain { 
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders){
            sender.senderMessage("환영합니다.");
        }
    }
}


