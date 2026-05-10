package org.prep_guide.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingOccuranceInString {
    public static void main(String[] args) {
        //----
        String str = "abdjsbfiwfviewvfikevAAAAAAA";
        int[] result = new int[128];
        for (char c : str.toCharArray()) {
            result[c]++;
        }
        System.out.println(Arrays.toString(result));
        //---
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue());
        }
        //----
        System.out.println("");
       Map<String, Long> map2=  Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Map.Entry<String, Long> entry : map2.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue());
        }
    }
}
