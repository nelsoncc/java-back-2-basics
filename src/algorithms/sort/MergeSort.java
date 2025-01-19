package algorithms.sort;

public class MergeSort {

    public static void main(String[] args) {
        // Generate an array of random integers with the specified size
        int[] array = SortUtils.generateRandomIntArray(9);

        // Print the unsorted array
        SortUtils.printArray(array);
        // Sort the array using Merge Sort
        mergeSort(array);
        // Print the sorted array
        SortUtils.printArray(array);
        // Check if the array is sorted and print the result
        SortUtils.isArraySorted(array);
    }

    /**
     * Sorts the given array using the Merge Sort algorithm.
     *
     * @param array the array to be sorted
     */
    private static void mergeSort(int[] array) {
        // If the array is null or has less than two elements, it is already sorted
        if (array == null || array.length < 2) {
            return;
        }

        int inputLength = array.length;
        int midIndex = inputLength / 2;

        // Split the array into two halves
        int[] halfLeft = new int[midIndex];
        int[] halfRight = new int[inputLength - midIndex];

        // Copy the elements into the left half
        for (int i = 0; i < halfLeft.length; i++) {
            halfLeft[i] = array[i];
        }
        // Copy the elements into the right half
        for (int i = midIndex; i < inputLength; i++) {
            halfRight[i - midIndex] = array[i];
        }

        // Recursively sort both halves
        mergeSort(halfLeft);
        mergeSort(halfRight);

        // Merge the sorted halves
        merge(array, halfLeft, halfRight);
    }

    /**
     * Merges two sorted halves into a single sorted array.
     *
     * @param array the original array to be sorted
     * @param halfLeft the left half of the array
     * @param halfRight the right half of the array
     */
    private static void merge(int[] array, int[] halfLeft, int[] halfRight) {
        int leftSize = halfLeft.length;
        int rightSize = halfRight.length;
        int i = 0, j = 0, k = 0;

        // Merge the two halves into the original array
        while (i < leftSize && j < rightSize) {
            if (halfLeft[i] <= halfRight[j]) {
                array[k] = halfLeft[i];
                i++;
            } else {
                array[k] = halfRight[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left half
        while (i < leftSize) {
            array[k] = halfLeft[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right half
        while (j < rightSize) {
            array[k] = halfRight[j];
            j++;
            k++;
        }
    }
}
