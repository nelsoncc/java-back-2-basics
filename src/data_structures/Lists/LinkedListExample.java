package data_structures.Lists;

import java.util.LinkedList;

/**
 * LinkedList: Doubly-linked list implementation
 *
 * Characteristics:
 * - Access: O(n) - must traverse the list
 * - Insertion: O(1) - with node reference
 * - Removal: O(1) - with node reference
 * - Memory: More overhead (references)
 * - Ordering: Maintains insertion order
 *
 * Use cases:
 * - Frequent insertions/removals in middle
 * - Stack or Queue implementation
 * - When random access isn't needed
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // List operations
        list.add("A");        // O(1) at end
        list.addFirst("B");   // O(1) at start
        list.addLast("C");    // O(1) at end

        // Stack operations
        list.push("D");       // Adds at start
        String top = list.pop(); // Removes and returns first

        // Queue operations
        list.offer("E");      // Adds at end
        String first = list.poll(); // Removes and returns first

        // Peek operations
        String peekFirst = list.peekFirst();
        String peekLast = list.peekLast();

        // Access - O(n)
        String element = list.get(2); // Avoid - must traverse

        // Removal - O(1) with node reference
        list.remove("C");

        // Check emptiness
        boolean isEmpty = list.isEmpty();

        // Iteration
        for (String item : list) {
            System.out.println(item);
        }
    }
}
