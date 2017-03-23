package com.jeanboy.app.designpatterns.chain;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class Order {
    private double amount;
    private String purpose;

    public Order(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
