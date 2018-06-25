package com.kodilla.good.patterns.challenges.product;

public class Application {
    public static void main(String[] args) {
        Product book1 = new Book ("1-2/0-3/0-5", "How to play football? Manual for children and bored millionaires", 1);
        ProductOrderRequest order1 = new ProductOrderRequest(new User("Robert Lewandowski", "r.l@wp.pl", "Znicz Pruszków"),
                book1);
        ProductOrderRequest order2 = new ProductOrderRequest(new User("Wojciech Szczęsny", "w.s@wp.pl", "Arka Gdynia"),book1);
        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(
                new EmailService(), new ProductOrderService(), new ProductOrderRepository());
        productOrderProcessor.process(order1);
        productOrderProcessor.process(order2);

    }
}
