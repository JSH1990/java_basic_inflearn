package ex1;

public class Car {
    private String name;
    private static int count;

    public static int showTotalCars(){
        System.out.println("count = " + count);
        return count;
    }

    public Car(String name) {
        this.name = name;
        System.out.println("name = " + name);
        count++;
    }

}
