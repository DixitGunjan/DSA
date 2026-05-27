package org.prep_guide.strings;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        List<String> list = List.of("abc", "bca", "def", "efd", "acb");
        Map<String, List<String>> resultMap = new HashMap<>();

        for (String s : list) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String tempString = new String(charArray);

            if (resultMap.containsKey(tempString)) {
                List<String> tempList = resultMap.get(tempString);
                tempList.add(s);
                resultMap.put(tempString, tempList);
            } else {
                resultMap.put(tempString, new ArrayList<>(List.of(s)));
            }
        }

        List<List<String>> results = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : resultMap.entrySet()) {
            results.add(entry.getValue());
            System.out.println(entry.getValue());
        }
    }
}
