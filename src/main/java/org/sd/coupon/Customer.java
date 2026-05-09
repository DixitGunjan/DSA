package org.sd.coupon;

public class Customer {
    private final int id;
    private final CustomerType type;

    public Customer(int id, CustomerType type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public CustomerType getType() {
        return type;
    }
}
