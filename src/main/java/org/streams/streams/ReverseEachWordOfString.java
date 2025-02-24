package org.streams.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String str = "This is a good day";

        String rStr = Arrays.stream(str.split(" ")).map(st -> new StringBuilder(st).reverse()).collect(Collectors.joining(" "));

        System.out.println(rStr);}
}
