package nested.annoymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void hellDice(int count){
        System.out.println("프로그램 시작");

        //코드 조각 시작
        int randomValue = new Random().nextInt(count) + 1;
        System.out.println("주사위 = " + randomValue);

        for(int i = 1; i <= 3; i++){
            System.out.println("i = " + i);
        }

        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void helloSum(){
        System.out.println("프로그램 시작");

        //코드 조각 시작


        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hellDice(6);
    }

}
