package org.streams.streams;

import java.util.*;
import java.util.function.Function;

import static java.util.List.of;
import static java.util.stream.Collectors.*;

public class Problems1 {

    public static void main(String[] args) {
        //1. Longest String
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        String longestString = strings.stream().max((s1, s2) -> s1.length() > s2.length() ? 1 : -1).get();
        String longestString1 = strings.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(longestString1);


        //2. Average price from a List

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        Double average = productsList.stream().mapToDouble(p -> p.price).average().orElse(0);
        System.out.println(average);

        //3. partitioning by even odd
        List<Integer> list = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> map = list.stream().collect(partitioningBy(i -> i % 2 == 0));

        System.out.println(map);

        //4. Remove Duplicates
        List<Integer> listOfDuplicates = of(1,1,2,3,3,4,4,4,5,6,7,8);

        List<Integer> finalList = listOfDuplicates.stream().distinct().toList();

        System.out.println(finalList);

        //5. Find Occurence of Each charecter in String
        String stringChar = "GUNJAN";
        Map<String, Long> resultMap = Arrays.stream(stringChar.split("")).collect(groupingBy(Function.identity(), counting()));
        System.out.println(resultMap);

        //Sort a list in reverse
        List<Integer> listInt = of(1,2,3,4,5,6,7,8,9);

        List<Integer> result1 = listInt.stream().sorted(Comparator.reverseOrder()).toList();
        List<Integer> result2 = listInt.stream().sorted((x, y) -> Integer.compare(y, x)).toList();
        System.out.println(result1);
        System.out.println(result2);
    }
}
