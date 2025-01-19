package data_structures.Queues;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * PriorityQueue: Binary heap implementation
 *
 * Characteristics:
 * - Insert/Remove: O(log n)
 * - Peek: O(1)
 * - Memory: Implemented as binary heap
 * - Ordering: By priority (natural or Comparator)
 *
 * Use cases:
 * - Task scheduling
 * - Top K elements
 * - Dijkstra's algorithm
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Natural ordering
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Custom ordering (reverse)
        PriorityQueue<Integer> reverseQueue = new PriorityQueue<>(
                Comparator.reverseOrder()
        );

        // Adding elements - O(log n)
        queue.offer(3);
        queue.offer(1);
        queue.offer(2);

        // Peek minimum - O(1)
        int min = queue.peek();

        // Poll minimum - O(log n)
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Prints: 1, 2, 3
        }

        // Custom class example
        record Task(String name, int priority) {}

        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
                Comparator.comparingInt(Task::priority)
        );

        taskQueue.offer(new Task("Low", 3));
        taskQueue.offer(new Task("High", 1));
        taskQueue.offer(new Task("Medium", 2));
    }
}
