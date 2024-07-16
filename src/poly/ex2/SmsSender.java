package poly.ex2;

public class SmsSender implements Sender {
    @Override
    public void senderMessage(String message) {
        System.out.println("SMS에 발송합니다" );
        System.out.println(message);
    }
}
