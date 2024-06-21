package class1.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 갯수를 입력하세요 :");

        int n = sc.nextInt();
        sc.nextLine();

        //배열 크기를 정하기위해 변수 n값 사용
        ProductOrder[] orders = new ProductOrder[n];
        System.out.println(orders.length);
        //주문 갯수 반복하기 위한 변수 i
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요");


            System.out.println("갯수");
            int quantity = sc.nextInt();

            System.out.println("가격");
            int price = sc.nextInt();

            System.out.println("상품명");
            String productName = sc.nextLine();
            sc.nextLine();
            orders[i] = createOrder(productName, price, quantity);

        }



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
