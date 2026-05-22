package org.streams.sheet;

import java.util.Comparator;
import java.util.List;

public class LongestStringInAList {
    public static void main(String[] args) {
        List<String> strings = List.of("acksfk", "anlhifocbisocb", "cfeofohbwe", "dflfhlewh", "efhoe", "f", "g", "h", "i");
        String result = strings.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        System.out.println(result);
    }
}
