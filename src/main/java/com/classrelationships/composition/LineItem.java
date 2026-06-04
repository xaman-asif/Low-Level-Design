package com.classrelationships.composition;

public class LineItem {
    private String productName;
    private int quantity;
    private double unitPrice;

    public LineItem(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getSubtotal() {
        return quantity * unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void describe() {
        System.out.printf("%s x%d @ $%.2f = $%.2f%n",
                productName, quantity, unitPrice, getSubtotal());
    }
}
