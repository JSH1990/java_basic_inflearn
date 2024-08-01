package exception.basic.checked;

public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message); //부모에서 message 보관
    }
}
