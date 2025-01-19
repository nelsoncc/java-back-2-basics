package algorithms.sort;

public class QuickSort {

    public static void main(String[] args) {
        // Generate an array of random integers with the specified size
        int[] array = SortUtils.generateRandomIntArray(10);

        // Print the unsorted array
        SortUtils.printArray(array);
        // Sort the array using Quick Sort
        quickSort(array);
        // Print the sorted array
        SortUtils.printArray(array);
        // Check if the array is sorted and print the result
        SortUtils.isArraySorted(array);
    }

    // Wrapper method for bubbleSort to sort the entire array
    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // Recursive method to perform the Quick Sort algorithm
    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        // Base case: if the low index is greater than or equal to the high index, return
        if (lowIndex >= highIndex) {
            return;
        }

        // Choose the pivot element (last element in the current sub-array)
        int pivot = array[highIndex];

        // Initialize pointers for the partitioning process
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // Partition the array around the pivot
        while (leftPointer < rightPointer) {
            // Move the left pointer to the right until an element greater than the pivot is found
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // Move the right pointer to the left until an element less than the pivot is found
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            // Swap the elements at the left and right pointers
            swap(array, leftPointer, rightPointer);
        }
        // Swap the pivot element with the element at the left pointer
        swap(array, leftPointer, highIndex);

        // Recursively sort the sub-arrays
        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

}
