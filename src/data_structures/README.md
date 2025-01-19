# Complete Guide to Java Data Structures

## Table of Contents
1. [Lists](./Lists)
    - [ArrayList](./Lists/ArrayListExample.java)
    - [LinkedList](./Lists/LinkedListExample.java)
    - Vector (legacy)
2. [Sets](./Sets)
    - [HashSet](./Sets/HashSetExample.java)
    - [LinkedHashSet](./Sets/LinkedHashSetExample.java)
    - [TreeSet](./Sets/TreeSetExample.java)
3. [Queues](./Queues)
    - [PriorityQueue](./Queues/PriorityQueueExample.java)
    - [ArrayDeque](./Queues/ArrayDequeExample.java)
4. [Maps](./Maps)
    - [HashMap](./Maps/HashMapExample.java)
    - [LinkedHashMap](./Maps/LinkedHashMapExample.java)
    - [TreeMap](./Maps/TreeMapExample.java)
    - [Hashtable](./Maps/HashtableExample.java) (legacy)
    - [ConcurrentHashMap](./Maps/ConcurrentHashMapExample.java)
5. [Comparison Table](#comparison-table)
6. [Notes on the Table](#notes-on-the-table)
7. [Detailed Notes on the Table](#detailed-notes-on-the-table)
8. [Final Recommendations](#final-recommendations)
    - [Final Recommendations Detailed](#final-recommendations-detailed)


## Comparison Table

| Structure         | Access     | Insertion   | Removal     | Sorting             | Memory  | Duplicates | Null          | Thread-Safe |
|-------------------|------------|-------------|-------------|---------------------|---------|------------|---------------|-------------|
| ArrayList         | O(1)       | O(1)/O(n)*  | O(1)/O(n)*  | Insertion           | Low     | Yes        | Yes           | No          |
| LinkedList        | O(n)       | O(1)        | O(1)        | Insertion           | High    | Yes        | Yes           | No          |
| HashSet           | O(1)       | O(1)        | O(1)        | No                  | Medium  | No         | Yes           | No          |
| LinkedHashSet     | O(1)       | O(1)        | O(1)        | Insertion           | High    | No         | Yes           | No          |
| TreeSet           | O(log n)   | O(log n)    | O(log n)    | Natural/Custom      | High    | No         | No            | No          |
| PriorityQueue     | O(1)**     | O(log n)    | O(log n)    | Priority            | Medium  | Yes        | No            | No          |
| HashMap           | O(1)       | O(1)        | O(1)        | No                  | Medium  | Values     | One key       | No          |
| LinkedHashMap     | O(1)       | O(1)        | O(1)        | Insertion           | High    | Values     | One key       | No          |
| TreeMap           | O(log n)   | O(log n)    | O(log n)    | Natural/Custom      | High    | Values     | No            | No          |
| Hashtable         | O(1)       | O(1)        | O(1)        | No                  | Medium  | Values     | No            | Yes         |

Notes:  
\* O(1) for end of list, O(n) for middle of list  
\** For peek/element, O(log n) for poll/remove

### Notes on the Table:
- **Access**: Time to retrieve an element
- **Insertion/Removal**: Time to add/remove elements
- **Sorting**: How elements are ordered
- **Memory**: Relative memory consumption
- **Duplicates**: Whether duplicate elements are allowed
- **Null**: Whether null elements are allowed
- **Thread-Safe**: Whether it is safe for multiple threads

### Detailed notes on the Table:
1. **Access**: Time to retrieve an element
    - O(1): Constant time (ArrayList, HashMap)
    - O(n): Linear time (LinkedList)
    - O(log n): Logarithmic time (TreeMap, TreeSet)

2. **Memory Usage**:
    - Low: Minimal overhead (ArrayList, ArrayDeque)
    - Medium: Some overhead (HashSet, HashMap)
    - High: Significant overhead (LinkedList, TreeMap)

3. **Ordering**:
    - None: No guaranteed order (HashSet, HashMap)
    - Insertion: Maintains insertion order (LinkedHashMap)
    - Sorted: Natural or custom ordering (TreeSet, TreeMap)
    - Priority: Based on comparator (PriorityQueue)

4. **Thread-Safety**:
    - Most collections are not thread-safe by default
    - Use Collections.synchronizedXXX() or concurrent versions when needed
    - Hashtable is thread-safe but legacy

### Final Recommendations:

1. Use `ArrayList` as the default for lists.
2. Use `HashMap` as the default for maps.
3. Use `HashSet` for unordered sets.
4. Use `TreeSet`/`TreeMap` when ordering is required.
5. Use `LinkedList` for queues/stacks.
6. Use `PriorityQueue` for priority queues.
7. Avoid `Vector` and `Hashtable` (legacy).
8. Use `ConcurrentHashMap` for modern thread-safety.

#### Final Recommendations Detailed:
1. **For Lists**:
    - Default choice: ArrayList
    - Many insertions/deletions in the middle: LinkedList
    - Thread-safe needs: CopyOnWriteArrayList

2. **For Sets**:
    - Default choice: HashSet
    - Need ordered iteration: LinkedHashSet
    - Need sorted elements: TreeSet

3. **For Maps**:
    - Default choice: HashMap
    - Need ordered iteration: LinkedHashMap
    - Need sorted keys: TreeMap
    - Thread-safe needs: ConcurrentHashMap

4. **For Queues**:
    - Default queue: ArrayDeque
    - Priority needs: PriorityQueue
    - Thread-safe queue: ConcurrentLinkedQueue

5. **Best Practices**:
    - Program to interfaces (List, Set, Map)
    - Choose based on dominant operation
    - Consider memory vs. speed tradeoffs
    - Avoid legacy collections (Vector, Hashtable)
    - Use concurrent versions for thread-safety

6. **Performance Tips**:
    - Initialize with proper capacity when possible
    - Use appropriate load factors for hash-based collections
    - Consider memory constraints in large applications
    - Profile before optimizing
    - Use an appropriate collection for the use case
