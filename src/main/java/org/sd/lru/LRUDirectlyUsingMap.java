package org.sd.lru;

import java.util.LinkedHashMap;

public class LRUDirectlyUsingMap<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;

    LRUDirectlyUsingMap(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K,V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUDirectlyUsingMap<Integer, String> lruCache = new LRUDirectlyUsingMap<>(3);
        lruCache.put(1, "one");
        lruCache.put(2, "two");
        lruCache.put(3, "three");
        System.out.println(lruCache); // {1=one, 2=two, 3=three}

        lruCache.get(1); // Access key 1 to make it recently used
        lruCache.put(4, "four"); // This will evict key 2 (least recently used)
        System.out.println(lruCache); // {3=three, 1=one, 4=four}
    }
}
