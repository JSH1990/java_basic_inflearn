package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{
    private String errorCode;


    //예외를 받을때 메세지와 에러코드를 받는다.
    public NetworkClientExceptionV2(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
