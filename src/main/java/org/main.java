package org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.List.of;

public class main {
    public static void main(String[] args) {
        List<Integer> a = of(19, 20, 21);
        List<Integer> b = of(18, 21, 20);
        int[] arr = new int[2];

        for (int i = 0; i < a.size(); i++) {
            if (Objects.equals(a.get(i), b.get(i))) continue;
            if (a.get(i) > b.get(i)) {
                arr[0]++;
            } else
                arr[1]++;
        }

        List<Integer> result = new ArrayList<>(Arrays.asList(arr[0], arr[1]));
        result.forEach(System.out::println);

    }
}
