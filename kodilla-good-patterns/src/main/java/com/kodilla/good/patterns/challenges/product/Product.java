package com.kodilla.good.patterns.challenges.product;

public abstract class Product {
    private String productId;
    private String productName;
    private int inStore;

    public Product(String productId, String productName, int inStore) {
        this.productId = productId;
        this.productName = productName;
        this.inStore = inStore;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getInStore() {
        return inStore;
    }

    public void setInStore(int inStore) {
        this.inStore = inStore;
    }
}
