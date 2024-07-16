package poly.ex2;

public class FaceBookSender implements Sender {
    @Override
    public void senderMessage(String message) {
        System.out.println("페이스북에 발송합니다");
        System.out.println(message);
    }
}
