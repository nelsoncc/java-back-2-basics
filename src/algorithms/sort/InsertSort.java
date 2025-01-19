package algorithms.sort;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = SortUtils.generateRandomIntArray(5);
        // Print the unsorted array
        SortUtils.printArray(array);
        // Sort the array using Insert Sort
        insertSort(array);
        // Print the sorted array
        SortUtils.printArray(array);
        // Check if the array is sorted
        SortUtils.isArraySorted(array);
    }

    private static void insertSort(int[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentValue) {
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }

    }
}
