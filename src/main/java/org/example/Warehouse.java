package org.example;

public class Warehouse {

    private double balance;
    private double capacity;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
        this.balance = 0;
    }
    public double getBalance() { return this.balance;}
    public double getCapacity() {
        return this.capacity;
    }
    public double howMuchSpaceLeft() {
        return this.balance;
    }
    public void addToWarehouse(double amount) {
        if (!(amount < 0) && amount <= this.capacity) {
            this.capacity -= amount;
        } else {
            System.out.println("Nothing is added");
        }
    }
    public double takeFromWarehouse(double amount) {
        if (amount < 0) return 0;
        if (amount > this.capacity) return this.capacity;
        this.capacity += amount;
        this.balance += amount;
        return amount;
    }
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}

class ProductWarehouse extends  Warehouse {
    private String productName;
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }


}