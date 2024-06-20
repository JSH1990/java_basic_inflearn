package class1.ex;

public class ProductOrder {
    private String productName;
    private int quantity;
    private int price;

    public ProductOrder(String productName, int quantity, int price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "상품이름='" + productName + '\'' +
                ", 갯수=" + quantity +
                ", 가격=" + price +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
