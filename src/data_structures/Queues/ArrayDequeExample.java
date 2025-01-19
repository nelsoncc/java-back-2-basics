package data_structures.Queues;

import java.util.ArrayDeque;

/**
 * ArrayDeque: Array-based double-ended queue
 *
 * Characteristics:
 * - Insert/Remove at both ends: O(1)
 * - Memory: More efficient than LinkedList
 * - No capacity restrictions
 * - Not thread-safe
 *
 * Use cases:
 * - Stack implementation
 * - Queue implementation
 * - Sliding window problems
 */
public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Stack operations
        deque.push("A");      // Add to front
        deque.push("B");
        String top = deque.pop(); // Remove from front

        // Queue operations
        deque.offer("C");     // Add to end
        deque.offer("D");
        String first = deque.poll(); // Remove from front

        // Deque operations
        deque.addFirst("E");  // Add to front
        deque.addLast("F");   // Add to end
        String front = deque.removeFirst(); // Remove from front
        String back = deque.removeLast();   // Remove from end

        // Peek operations
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();

        // Size operations
        int size = deque.size();
        boolean isEmpty = deque.isEmpty();

        // Clear
        deque.clear();
    }
}
