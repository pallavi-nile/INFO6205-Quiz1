public class BubbleSort {
    /**
     * Sorts the given array using the Bubble Sort algorithm.
     *
     * @param a The array to be sorted. It contains elements that implement the Comparable interface.
     */
    public void sort(Comparable[] a) {
        boolean swapped;
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Loop through the array up to the unsorted part
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements and swap if necessary
                if (a[j].compareTo(a[j + 1]) > 0) {
                    swap(a, j, j + 1);
                    swapped = true; // Mark that a swap occurred
                }
            }

            // Break early if no swaps were made during this pass
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Swaps two elements in the given array.
     *
     * @param a The array in which the elements are to be swapped.
     * @param j The index of the first element to swap.
     * @param i The index of the second element to swap.
     */
    private void swap(Object[] a, int j, int i) {
        Object temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();

        // Test with an array of integers
        Integer[] numbers = {5, 3, 8, 4, 6};
        System.out.println("Before sorting: ");
        printArray(numbers);

        sorter.sort(numbers);

        System.out.println("After sorting: ");
        printArray(numbers);

        // Test with an array of strings
        String[] words = {"banana", "apple", "cherry", "date"};
        System.out.println("Before sorting: ");
        printArray(words);

        sorter.sort(words);

        System.out.println("After sorting: ");
        printArray(words);
    }

    /**
     * Prints the elements of an array.
     *
     * @param array The array to be printed.
     */
    private static void printArray(Object[] array) {
        for (Object element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
