package com.classrelationships.composition;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD-1001");
        order.addItem("Wireless Mouse", 2, 29.99);
        order.addItem("USB-C Cable", 3, 9.99);
        order.addItem("Laptop Stand", 1, 49.99);

        order.printReceipt();

        // When order is deleted, all LineItems are destroyed with it.
        // No LineItem exists outside of an Order.
    }
}
