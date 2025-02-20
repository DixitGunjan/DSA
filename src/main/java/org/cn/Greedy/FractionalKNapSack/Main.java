package org.cn.Greedy.FractionalKNapSack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<KnapsackItem> items = new ArrayList<>();
        items.add(new KnapsackItem(0, 100, 20));
        items.add(new KnapsackItem(1, 120, 30));
        items.add(new KnapsackItem(2, 60, 10));
        int capacity = 50;
        knapSack(items, capacity);
    }

    static void knapSack(List<KnapsackItem> items, int capacity) {
        Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>() {
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if (o2.getRatio() > o1.getRatio()) return 1;
                else return -1;
            }
        };
        Collections.sort(items, comparator);

        int usedCapacity = 0;
        double totalValue = 0;

        for (KnapsackItem item : items) {
            if (usedCapacity + item.getWeight() <= capacity) {
                usedCapacity += item.getWeight();
                System.out.println("Taken - " + item);
                totalValue += item.getValue();
            } else {
                int usedWeight = capacity - usedCapacity;
                double value = item.getRatio() * usedWeight;
                System.out.println("Taken - " + item + " with ibtained value " + value);
                usedCapacity += usedWeight;
                totalValue += value;
            }
            if (usedCapacity == capacity) break;
        }
        System.out.println("Total value = " + totalValue);
    }
}
