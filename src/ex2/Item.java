package ex2;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
