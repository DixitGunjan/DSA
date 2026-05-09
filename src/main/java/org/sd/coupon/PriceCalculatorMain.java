package org.sd.coupon;

import java.util.Comparator;
import java.util.List;

public class PriceCalculatorMain {
    public static void main(String[] args) {
        Customer customer = new Customer(1, CustomerType.PLATINUM);

        List<Coupon> couponList = List.of(new Coupon("FLAT100", 10, "D", true, 3000f, 3),
                new Coupon("FLAT20", 20, "P", true, 5000f, 2),
                new Coupon("IPL10", 30, "P", true, 7000f, 1)
        );

        List<Coupon> priotisedCoupons = couponList.stream().filter(Coupon::isActive)
                .sorted(Comparator.comparing(Coupon::getPriority)).toList();

        double price = 10000f;
        for (Coupon coupon : priotisedCoupons) {
            Discount discount;
            if (coupon.getType().equalsIgnoreCase("P")) {
                discount = new PercentageDiscount();
                price = discount.applyDiscount(coupon, price);
            }
            if (coupon.getType().equalsIgnoreCase("D")) {
                discount = new FlatDiscount();
                price = discount.applyDiscount(coupon, price);
            }
        }
        if (customer.getType().equals(CustomerType.PLATINUM)) {
            price = price * 0.9f;
        } else if (customer.getType().equals(CustomerType.GOLD)) {
            price = price * 0.95f;
        }
        System.out.println("Final Price is - " + String.format("%.2f", price));
    }
}
