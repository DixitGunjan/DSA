package org.streams.sheet;

import java.util.Arrays;
import java.util.List;

public class FlatteningOrderItems {
    static class Order {
        private int orderId;
        private List<OrderItem> items;

        public int getOrderId() {
            return orderId;
        }

        public List<OrderItem> getItems() {
            return items;
        }

        public Order(int orderId, List<OrderItem> items) {
            this.orderId = orderId;
            this.items = items;
        }
    }

    static class OrderItem {
        private String name;
        private int quantity;

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public OrderItem(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
    }

    void main() {
        Order order1 = new Order(
                1,
                Arrays.asList(
                        new OrderItem("Laptop", 1),
                        new OrderItem("Mouse", 2)
                ));

        Order order2 = new Order(
                2,
                Arrays.asList(
                        new OrderItem("Keyboard", 1),
                        new OrderItem("Monitor", 2)
                ));

        List<Order> orders = Arrays.asList(order1, order2);

        List<OrderItem> orderL = orders.stream().flatMap(order -> order.getItems().stream()).toList();

        orderL.forEach(System.out::println);
    }
}
