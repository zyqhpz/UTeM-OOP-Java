package model;

import cloudinterface.Payment;

public class Customer extends User implements Payment {
    private int year;
    private double discount;
    private double totalPrice;
    private double balance;
    private Subcription subscription;

    public Customer() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiscount() {
        if (year < 3) {
            setDiscount(0);
        } else if (year <= 4 && year >= 3) {
            setDiscount(20);
        } else {
            setDiscount(40);
        }
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        Subcription subs = getSubcription();
        totalPrice = subs.getPrice() * (100 - getDiscount()) / 100;
        setTotalPrice(totalPrice);
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Subcription getSubcription() {
        return subscription;
    }

    public void setSubcription(Subcription subscription) {
        this.subscription = subscription;
    }

    public double doPayment(double payment) throws InsufficientAmount {
        if (payment >= getTotalPrice()) {
            balance = payment - getTotalPrice();
            setBalance(balance);
        } else {
            throw new InsufficientAmount();
        }
        return balance;
    }
}
