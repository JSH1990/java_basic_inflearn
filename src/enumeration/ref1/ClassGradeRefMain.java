package enumeration.ref1;

import enumeration.ex2.DiscountService1;

public class ClassGradeRefMain {
    public static void main(String[] args) {
        int price = 1000;

        DiscountService2 discountService = new DiscountService2();
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);


        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
