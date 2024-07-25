package enumeration.ex2;

import enumeration.ex0.DiscountService;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 1000;

        DiscountService1 discountService = new DiscountService1();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);


        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
