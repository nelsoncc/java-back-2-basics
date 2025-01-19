package data_structures.Maps;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * TreeMap: Red-black tree based NavigableMap
 *
 * Characteristics:
 * - Access/Insert/Remove: O(log n)
 * - Memory: Higher than HashMap
 * - Ordering: Natural or custom Comparator
 * - Null: No null keys, null values allowed
 *
 * Use cases:
 * - Need sorted keys
 * - Range operations
 * - Floor/ceiling operations
 * - Need to maintain order
 */
public class TreeMapExample {
    public static void main(String[] args) {
        // Natural ordering
        TreeMap<String, Integer> map = new TreeMap<>();

        // Custom comparator
        TreeMap<String, Integer> customMap = new TreeMap<>(
                Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder())
        );

        // Basic operations
        map.put("B", 2);
        map.put("A", 1);
        map.put("C", 3);

        // Navigation operations
        Map.Entry<String, Integer> firstEntry = map.firstEntry();
        Map.Entry<String, Integer> lastEntry = map.lastEntry();

        // Ceiling/Floor operations
        String ceilingKey = map.ceilingKey("B"); // Least key >= "B"
        String floorKey = map.floorKey("B");     // Greatest key <= "B"

        // Range views
        NavigableMap<String, Integer> subMap =
                map.subMap("A", true, "C", false); // Range ["A", "C")

        // Descending order
        NavigableMap<String, Integer> descMap = map.descendingMap();

        // Useful methods for ranges
        Map.Entry<String, Integer> higherEntry = map.higherEntry("B");
        Map.Entry<String, Integer> lowerEntry = map.lowerEntry("B");

        // Poll operations
        Map.Entry<String, Integer> first = map.pollFirstEntry();
        Map.Entry<String, Integer> last = map.pollLastEntry();

        // Iteration (always in sorted order)
        for (var entry : map.entrySet()) {
            System.out.printf("Key: %s, Value: %d%n",
                    entry.getKey(), entry.getValue());
        }
    }
}
