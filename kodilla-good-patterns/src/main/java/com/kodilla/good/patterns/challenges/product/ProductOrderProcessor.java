package com.kodilla.good.patterns.challenges.product;

public class ProductOrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService,
                                 final OrderService orderService,
                                 final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void process(final ProductOrderRequest orderRequest) {
        boolean isAvailable = orderService.order(orderRequest.getProduct());

        if(isAvailable) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
        } else {
            System.out.println("\"" + orderRequest.getProduct().getProductName() + "\" is out of stock");
        }
    }
}
