package org.streams.streams;

import java.util.Comparator;
import java.util.List;

public class SortingListOfStringBasedOnLength {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("Gunjan", "Akash", "truck", "ROHITJI");

        List<String> resultString = listOfStrings.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(resultString);
    }
}
