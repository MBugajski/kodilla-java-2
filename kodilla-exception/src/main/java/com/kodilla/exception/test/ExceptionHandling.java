package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 1));

        } catch (Exception e) {

            System.out.println("Wrong thing happened. Please panic!");

        } finally {

            System.out.println("Thank you for using our very useful program!");

        }

        try {

            System.out.println(secondChallenge.probablyIWillThrowException(2, 1));

        } catch (Exception e) {

            System.out.println("Wrong thing happened. Please panic!");

        } finally {

            System.out.println("Thank you for using our very useful program!");

        }
    }
}
