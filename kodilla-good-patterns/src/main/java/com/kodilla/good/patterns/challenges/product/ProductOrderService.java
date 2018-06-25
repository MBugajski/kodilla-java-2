package com.kodilla.good.patterns.challenges.product;

public class ProductOrderService implements OrderService {
    private Product product;

    @Override
    public boolean order(Product product) {
        if (product.getInStore() > 0) {
            product.setInStore(product.getInStore() - 1);
            return true;
        }
        return false;
    }
}
