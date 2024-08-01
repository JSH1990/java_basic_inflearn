package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{
        throw new RuntimeException("ex"); //예외만들기
    }
}
