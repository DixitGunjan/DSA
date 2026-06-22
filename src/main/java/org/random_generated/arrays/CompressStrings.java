package org.random_generated.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompressStrings {
    void main() {
        String str = "aaabbbbccccdddeeeffg";
        StringBuilder sb = new StringBuilder();

        char ch = str.charAt(0);
        int count = 1;
        int index = 0;

        if (str.length() == 1) {
            System.out.println(str + count * index);
        }
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);

            if (ch == cur) {
                count++;
            } else {
                sb.append(ch).append(count * index);
                ch = cur;
                index = i;
                count = 1;
            }
        }
        sb.append(ch).append(count * index);
        System.out.println(sb.toString());
    }
}
