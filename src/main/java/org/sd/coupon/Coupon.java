package org.sd.coupon;

public class Coupon {
    private final String code;
    private final double discount;
    private final String type;
    private final boolean isActive;
    private final double minAMountCondition;
    private final int priority;

    public Coupon(String code, double discount, String type, boolean isActive, double minAMountCondition, int priority) {
        this.code = code;
        this.discount = discount;
        this.type = type;
        this.isActive = isActive;
        this.minAMountCondition = minAMountCondition;
        this.priority = priority;
    }

    public String getCode() {
        return code;
    }

    public double getDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }

    public boolean isActive() {
        return isActive;
    }

    public double getMinAMountCondition() {
        return minAMountCondition;
    }

    public int getPriority() {
        return priority;
    }
}
