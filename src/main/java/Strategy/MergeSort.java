package Strategy;

import java.util.Arrays;


/*

Merge Sort is a divide-and-conquer algorithm that splits an array into two halves, recursively sorts them, and then merges the sorted halves.
It ensures a stable and efficient sorting process even for large datasets.
Making it much faster than simple algorithms like Selection Sort. Merge Sort is widely used in cases where stable sorting is required.
It is ideal for large datasets due to its performance.

 */
public class MergeSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            sort(left);
            sort(right);

            merge(array, left, right);
        }
    }

    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
