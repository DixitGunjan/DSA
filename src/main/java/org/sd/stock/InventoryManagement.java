package org.sd.stock;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InventoryManagement {

    private final Map<String, AtomicInteger> inventory = new ConcurrentHashMap<>();

    InventoryManagement(String sku, int quantity) {
        if (sku == null || sku.isEmpty() || quantity < 0) {
            throw new IllegalArgumentException("Invalid SKU or quantity");
        }
        inventory.put(sku, new AtomicInteger(quantity));
    }

    public int getStock(String sku) {
        if (sku == null || sku.isEmpty()) {
            throw new IllegalArgumentException("Invalid SKU");
        }
        return inventory.getOrDefault(sku, new AtomicInteger(0)).get();
    }

    public boolean reserveStock(String sku, int quantity) {
        if (sku == null || sku.isEmpty() || quantity <= 0) {
            throw new IllegalArgumentException("Invalid SKU or quantity");
        }

        AtomicInteger stock = inventory.get(sku);
        if (stock == null) {
            return false;
        }
        int currentStock = stock.get();
        if (quantity > currentStock) {
            return false;
        }

        int left = currentStock - quantity;
        return stock.compareAndSet(currentStock, left);
    }

    public void restock(String sku, int quantity) {
        if (sku == null || sku.isEmpty() || quantity <= 0) {
            throw new IllegalArgumentException("Invalid SKU or quantity");
        }
        if (inventory.containsKey(sku)) {
            inventory.get(sku).addAndGet(quantity);
        } else {
            inventory.put(sku, new AtomicInteger(quantity));
        }
    }

    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement("SKU-1", 10);

        Runnable task = () ->{
            boolean success = inventory.reserveStock("SKU-1", 2);
            if(!success){
                inventory.restock("SKU-1", 5);
            }
            System.out.println(Thread.currentThread().getName()
                    + " -> reserve: " + success
                    + ", remaining: " + inventory.getStock("SKU-1"));
        };

        Thread[] t = new Thread[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(task, "Thread-" + (i + 1));
            t[i].start();
        }

        for(Thread thread : t) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final stock for SKU-1: " + inventory.getStock("SKU-1"));
    }
}
