package class1.ex;public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];


        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 2000, 1);
        orders[2] = createOrder("콜라", 2000, 1);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("totalAmount = " + totalAmount);
    }

    private static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.setProductName(productName);
        order.setQuantity(quantity);
        order.setPrice(price);
        return order;
    }

    private static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.getPrice() * order.getQuantity();
        }
        return totalAmount;
    }

    private static void printOrders(ProductOrder[] orders) {
        System.out.println();
        for (ProductOrder order : orders) {
            System.out.println("상품명 = " + order.getProductName() );
        }
    }
    }
