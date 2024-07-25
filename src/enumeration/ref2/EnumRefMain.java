package enumeration.ref2;


import enumeration.ex2.DiscountService1;

public class EnumRefMain {
    public static void main(String[] args) {
        int price = 1000;
        System.out.println(Grade.BASIC.discount(price));
        System.out.println(Grade.GOLD.discount(price));
        System.out.println(Grade.DIAMOND.discount(price));
    }
}
