package enumeration.test;

public enum AuthGrade {
        GUEST(1, "손님"),
        LOGIN(2, "로그인 회원"),
        ADMIN(3, "관리자");

        private final int value;
        private final String description;



    AuthGrade(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    /*
    화면 목록
     */
    public void funtion(){
        System.out.println("이메일 관리화면");
    }
    
    public String getDescription() {
        return description;
    }

//    @Override
//    public String toString() {
//        return "당신의 등급은 " + getDescription() + " 입니다.";
//    }

}
