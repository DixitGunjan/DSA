package org.tuf.arrays.easytab;

import java.util.List;
//To be corrected
public class FindKRotation {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,4,5,1,2,3,3);
        System.out.println(findN(list));
    }

    private static int findN(List<Integer> list) {
        int i = 1;
        while (i < list.size()) {
            if (list.get(i) >= list.get(i - 1)) {
                i++;
            } else {
                break;
            }
        }
        return list.size() - i;
    }
}
