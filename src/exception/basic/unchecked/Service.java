package exception.basic.unchecked;

/**
 * Unchecked 예외는 예외를 잡거나, 던지지않아도 된다.
 */
public class Service {
    Client client = new Client();
    
    public void callCatch(){
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리 , message=" + e.getMessage());
        }
        System.out.println("정상 로직");

    }

    public void callThrow(){
        client.call();
    }
}
