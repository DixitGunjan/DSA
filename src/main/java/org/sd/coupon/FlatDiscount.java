package org.sd.coupon;

public class FlatDiscount implements Discount {
    @Override
    public double applyDiscount(Coupon coupon, double price) {
        if (price > coupon.getMinAMountCondition()) {
            return price - coupon.getDiscount();
        }
        System.out.println("Price does not meet the minimum amount condition for this coupon." + coupon.getCode());
        return price;
    }
}
