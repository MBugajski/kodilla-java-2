package com.kodilla.good.patterns.challenges.product;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Order for " + user.getName() + " has been created");
        System.out.println("There has been some sort of communication with the database");
    }
}
