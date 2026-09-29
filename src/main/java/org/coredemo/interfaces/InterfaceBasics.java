package org.coredemo.interfaces;

public class InterfaceBasics {

    public static void main(String[] args) {

        Payment payment = new CreditCardPayment();
        payment.pay();
        payment.printReceipt();

    }
}


interface Payment {

    void pay();

    default void printReceipt() {
        System.out.println("Default receipt");
    }
}

class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid by credit card");
    }

    @Override
    public void printReceipt() {
        System.out.println("Credit Card Receipt");
    }
}