package enumeration.test2;

import java.util.Scanner;

import static enumeration.test2.HttpStatus.OK;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter HTTP status code: ");
        int httpCodeInput = sc.nextInt();

        HttpStatus httpStatus = HttpStatus.findByCode(httpCodeInput);
        if(httpStatus == null){
            System.out.println("정의되지않은 코드입니다.");
        }else {
            System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage());
            System.out.println("isSucess = " + httpStatus.isSuccessful());


        }
    }
}
