package algorithms.sort;

import java.util.Random;

public final class SortUtils {
    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                throw new RuntimeException("Array is not sorted");
            }
        }
        System.out.println("Array is sorted");
        return true;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /**
     * Generates an array of random integers.
     *
     * @param size the size of the array to generate
     * @return an array of random integers
     */
    public static int[] generateRandomIntArray(int size) {
        // Create a Random object to generate random integers
        Random random = new Random();
        // Initialize an array of the given size
        int[] array = new int[size];

        // Fill the array with random integers between 0 and 99999
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
        return array;
    }
}
