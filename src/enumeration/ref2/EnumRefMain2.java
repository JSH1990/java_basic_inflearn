package enumeration.ref2;


public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 1000;
        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);


    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() +  " " + price + " " + grade.discount(price));
    }
}
