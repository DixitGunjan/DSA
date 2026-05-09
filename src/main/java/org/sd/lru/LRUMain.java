package org.sd.lru;

public class LRUMain {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);   //3,1

        System.out.println(cache.get(1)); //10
        cache.put(4, 40);  //4,1
        System.out.println(cache.get(1));  //10
        System.out.println(cache.get(2));  //-1
        System.out.println(cache.get(3)); //30
    }
}
