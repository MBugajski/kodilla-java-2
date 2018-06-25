package com.kodilla.good.patterns.challenges.product;

public class ProductOrderRequest {
    private User user;
    private Product product;

    public ProductOrderRequest(final User user, final Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
