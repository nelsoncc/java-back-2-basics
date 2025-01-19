package data_structures.Sets;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet: Red-black tree based NavigableSet
 *
 * Characteristics:
 * - Access/Insert/Remove: O(log n)
 * - Memory: More than HashSet
 * - Ordering: Natural or custom Comparator
 * - No duplicates allowed
 *
 * Use cases:
 * - Need sorted elements
 * - Range queries
 * - Floor/ceiling operations
 */
public class TreeSetExample {
    public static void main(String[] args) {
        // Natural ordering
        TreeSet<String> set = new TreeSet<>();

        // Custom comparator (by length)
        TreeSet<String> customSet = new TreeSet<>(
                Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder())
        );

        // Insertion - O(log n)
        set.add("B");
        set.add("A");
        set.add("C");

        // Navigation operations
        String first = set.first();
        String last = set.last();
        String ceiling = set.ceiling("B"); // Least element >= "B"
        String floor = set.floor("B");     // Greatest element <= "B"

        // Range views
        SortedSet<String> headSet = set.headSet("B"); // Elements < "B"
        SortedSet<String> tailSet = set.tailSet("B"); // Elements >= "B"
        SortedSet<String> subSet = set.subSet("A", "C"); // Range ["A", "C")

        // Descending order
        NavigableSet<String> descSet = set.descendingSet();
    }
}
