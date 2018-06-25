package com.kodilla.good.patterns.challenges.product;

public class EmailService implements InformationService {
    @Override
    public void inform(User user, Product product) {
        System.out.println("Message has  been sent to "+ user.getName() + " on address " + user.getEmail() + " that \"" + product.getProductName() + "\" has been sent to his/her delivery address at " + user.getAddress() + ".");
    }
}
