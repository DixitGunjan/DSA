package org.streams.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamCount {

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        long ovcount = productsList.stream().count();

        long conditionalCount = productsList.stream().filter(p -> p.price >26000).count();

        System.out.println(ovcount + "   " + conditionalCount);
    }
}
