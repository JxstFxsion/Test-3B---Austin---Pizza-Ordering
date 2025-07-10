package com.austin.pizzaorder.model;

public class PizzaOrder {
    private int id;
    private String customerName;
    private String mobileNumber;
    private String pizzaSize;
    private int toppingsCount;
    private double totalBill;

    // Default constructor
    public PizzaOrder() {}

    // Constructor with all fields
    public PizzaOrder(int id, String customerName, String mobileNumber, String pizzaSize, int toppingsCount, double totalBill) {
        this.id = id;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.pizzaSize = pizzaSize;
        this.toppingsCount = toppingsCount;
        this.totalBill = totalBill;
    }

    // ✅ NOW generate the getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getToppingsCount() {
        return toppingsCount;
    }

    public void setToppingsCount(int toppingsCount) {
        this.toppingsCount = toppingsCount;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}

