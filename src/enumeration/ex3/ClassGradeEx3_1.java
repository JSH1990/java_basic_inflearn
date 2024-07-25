package enumeration.ex3;

import static enumeration.ex3.Grade.BASIC;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 1000;

        DiscountService3 discountService = new DiscountService3();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);


        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
