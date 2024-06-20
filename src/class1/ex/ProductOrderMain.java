package class1.ex;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder("컴퓨터", 1, 1500);
        ProductOrder productOrder2 = new ProductOrder("세탁기", 1, 2400);
        ProductOrder productOrder3 = new ProductOrder("냉장고", 1, 1200);

        List<ProductOrder> productOrderList = new ArrayList<ProductOrder>();
        productOrderList.add(productOrder1);
        productOrderList.add(productOrder2);
        productOrderList.add(productOrder3);

        int total = 0;

        for (ProductOrder productOrder : productOrderList) {
            System.out.println(productOrder);

            total += productOrder.getPrice();

        }

        System.out.println("총가격: " + total); 
    }
}
