package data_structures.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap: Hash table and linked list implementation
 *
 * Characteristics:
 * - Access/Insert/Remove: O(1)
 * - Memory: More than HashMap
 * - Ordering: Insertion or access order
 * - LRU cache capability
 *
 * Use cases:
 * - LRU cache
 * - Predictable iteration order
 * - Order-sensitive caching
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Insertion-order
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Access-order (LRU cache-like)
        LinkedHashMap<String, Integer> lruMap = new LinkedHashMap<>(
                16, 0.75f, true // true = access-order
        );

        // LRU cache implementation
        class LRUCache<K, V> extends LinkedHashMap<K, V> {
            private final int capacity;

            public LRUCache(int capacity) {
                super(capacity, 0.75f, true);
                this.capacity = capacity;
            }

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        }

        LRUCache<String, Integer> cache = new LRUCache<>(3);
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        cache.get("A"); // Moves "A" to the end
        cache.put("D", 4); // Removes eldest entry ("B")
    }
}
