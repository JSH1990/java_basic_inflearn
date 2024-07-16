package poly.ex2;

public class EmailSender implements Sender{
    @Override
    public void senderMessage(String message) {
        System.out.println("Email에 발송합니다");
        System.out.println(message);
    }
}
