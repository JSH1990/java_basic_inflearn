package fianl1;

public class FinalFiledMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ContructInit contructInit1 = new ContructInit(10);
        ContructInit contructInit2 = new ContructInit(20);
        System.out.println(contructInit1.value);
        System.out.println(contructInit2.value);

        System.out.println();

        //final 필드 - 필드초기화
        System.out.println("필드 초기화");
        FiledInit filedInit1 = new FiledInit();
        FiledInit filedInit2 = new FiledInit();
        FiledInit filedInit3 = new FiledInit();
        System.out.println(filedInit1.value);
        System.out.println(filedInit2.value);
        System.out.println(filedInit3.value);

        System.out.println();

        //상수
        System.out.println("상수");
        System.out.println(FiledInit.C0NST_VALUE);
    }
}
