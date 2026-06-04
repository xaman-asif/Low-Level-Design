package com.classrelationships.composition;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<LineItem> lineItems;

    public Order(String orderId) {
        this.orderId = orderId;
        this.lineItems = new ArrayList<>();
    }

    public void addItem(String product, int quantity, double unitPrice) {
        lineItems.add(new LineItem(product, quantity, unitPrice));
    }

    public void removeItem(String product) {
        lineItems.removeIf(item -> item.getProductName().equals(product));
    }

    public double getTotal() {
        double total = 0;
        for (LineItem item : lineItems) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("Order: " + orderId);
        for (LineItem item : lineItems) {
            item.describe();
        }
        System.out.printf("Total: $%.2f%n", getTotal());
    }
}
