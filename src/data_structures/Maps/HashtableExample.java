package data_structures.Maps;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Hashtable: Legacy thread-safe hash-based map
 *
 * Characteristics:
 * - Access/Insert/Remove: O(1) average
 * - Memory: Similar to HashMap
 * - Ordering: No order guarantee
 * - Thread-safe: Yes (synchronized)
 * - Null: No null keys or values
 *
 * Use cases:
 * - Legacy code
 * - Thread-safe operations (though ConcurrentHashMap preferred)
 * - When null values must be prohibited
 */
public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        // Basic operations (all synchronized)
        table.put("A", 1);
        table.put("B", 2);

        // Access
        int value = table.get("A");

        // Check existence
        boolean hasKey = table.containsKey("B");
        boolean hasValue = table.containsValue(2);

        // Legacy enumeration
        Enumeration<String> keys = table.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + ": " + table.get(key));
        }

        // Modern iteration
        for (var entry : table.entrySet()) {
            System.out.printf("Key: %s, Value: %d%n",
                    entry.getKey(), entry.getValue());
        }

        // Thread-safe operations
        synchronized(table) {
            if (!table.containsKey("C")) {
                table.put("C", 3);
            }
        }
    }
}
