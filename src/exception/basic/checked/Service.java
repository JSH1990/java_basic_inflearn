package exception.basic.checked;

public class Service {
    
    Client client = new Client();
    
    public void callCatch(){
        try {
            client.call();
        } catch (Exception e) {
            System.out.println(STR."예외처리, message : \{e.getMessage()}");
        }


        System.out.println("정상 흐름");

    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     */

    public void catchThrow() throws MyCheckedException{
        client.call();
    }
}
