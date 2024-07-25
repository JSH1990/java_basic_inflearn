package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex0.DiscountService discountService = new DiscountService();
        int vip = discountService.discount("VIP", price);
        System.out.println(vip);
    }
}
