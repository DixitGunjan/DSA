package org.sd.coupon;

public class PercentageDiscount implements Discount {
    @Override
    public double applyDiscount(Coupon coupon, double price) {
        if (price > coupon.getMinAMountCondition()) {
            return price - (price * (coupon.getDiscount() / 100));
        }
        System.out.println("Price does not meet the minimum amount condition for this coupon." + coupon.getCode());
        return price;
    }
}
