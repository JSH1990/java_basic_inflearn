package enumeration.ref1;

public class DiscountService2 {
    public int discount(ClassGrade classGrade, int price){
        return price * classGrade.getDicountPercent() / 100;
    }
}
