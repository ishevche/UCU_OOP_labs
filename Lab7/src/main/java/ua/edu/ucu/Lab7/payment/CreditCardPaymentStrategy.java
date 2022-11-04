package ua.edu.ucu.Lab7.payment;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CreditCardPaymentStrategy implements Payment {
    private double payed = 0;
    @Setter
    private double price;

    public CreditCardPaymentStrategy(double price) {
        this.price = price;
    }

    @Override
    public boolean getIsFullyPayed() {
        return payed >= price;
    }

    @Override
    public void pay(double price) {
        System.out.println("Thank you for your credit card payment!");
        payed += price;
    }
}
