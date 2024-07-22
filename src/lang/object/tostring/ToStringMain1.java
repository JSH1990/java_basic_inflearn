package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object obj = new Object();
        String string = obj.toString();

        //toString() 반환값 출력
        System.out.println(string);
        //object 직접 출력
        System.out.println(obj);

        //println(객체) 넣으면 주소참조값나오는 이유는 object.toStirng() 가 호출이 되는것이다.
        //ex) 객체클래스 객체 = object.toString();
    }
}
