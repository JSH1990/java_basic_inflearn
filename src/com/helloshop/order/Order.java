package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    Product product;
    User user;

    public Order(Product product, User user) {
        this.product = product;
        this.user = user;
    }
}
