package algorithms.sort;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = SortUtils.generateRandomIntArray(5);

        // Print the unsorted array
        SortUtils.printArray(array);
        // Sort the array using Bubble Sort
        sort(array);
        // Print the sorted array
        SortUtils.printArray(array);
        // Check if the array is sorted
        SortUtils.isArraySorted(array);
    }

    /**
     * Sorts the given array using the Bubble Sort algorithm.
     *
     * @param array the array to be sorted
     */
    private static void sort(int[] array) {
        // If the array is null or has only one element, it is already sorted
        if (array == null || array.length <= 1) {
            return;
        }

        boolean didSwap = true;

        // Continue sorting until no swaps are made in a pass
        while (didSwap) {
            didSwap = false;
            // Iterate through the array
            for (int i = 0; i < array.length - 1; i++) {
                // If the current element is greater than the next element, swap them
                if (array[i] > array[i + 1]) {
                    didSwap = true;
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
        }

    }
}
