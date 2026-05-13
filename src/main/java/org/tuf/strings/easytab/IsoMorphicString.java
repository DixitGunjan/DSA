package org.tuf.strings.easytab;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicString {
    public static void main(String[] args) {
        String a ="a11";
        String b = "b12";
        if(a.length() != b.length()){
            System.out.println(false);
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(Character c:a.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for(Character c:b.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        boolean result = true;
        for(int i =0;i<a.length();i++){
            if(!map1.get(a.charAt(i)).equals( map2.get(b.charAt(i)))){
                result = false;
                break;
            }
        }
        System.out.println(result);

    }
}
