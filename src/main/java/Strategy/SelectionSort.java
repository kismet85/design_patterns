package Strategy;


/*
Selection Sort repeatedly selects the smallest element from the unsorted portion of an array and swaps it with the element at the current position.
It performs this by iterating over the entire unsorted section to find the minimum. This algorithm is not for large datasets.
It is only useful when the dataset is small
 */
public class SelectionSort implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength-1; i++) {
            int minimumIndex = i;
            for (int j = i+1; j < arrayLength; j++) {
                if (array[j] < array[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = array[minimumIndex];
            array[minimumIndex] = array[i];
            array[i] = temp;
        }
    }
}
