package enumeration.test2;

public enum HttpStatus {
    OK(200, "OK"), BAD_REQUEST(400, "Bad Request"), NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;

    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int code) {
        HttpStatus[] values = values();
        for (HttpStatus status : values) {
           if (status.getCode() == code){
                return status;
            }
        }return null;
    }

    public boolean isSuccessful() {
        return code >= 200 && code <= 299;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HttpStatus{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
