package org.streams.streams;

import java.util.List;

public class CheckIfFirstCharecterisDigit {
    public static void main(String[] args) {
        List<String> list = List.of("1ne", "TWO", "3REE", "FOUR", "5ive");

        list.stream().filter(s -> Character.isDigit(s.charAt(0))).forEach(System.out::println);
    }
}
