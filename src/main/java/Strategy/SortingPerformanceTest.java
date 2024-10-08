package Strategy;

public class SortingPerformanceTest {
    public static void main(String[] args) {
        SortingContext context = new SortingContext();
        int[] smallData = TestDataGenerator.generateRandomArray(30);
        System.out.println("Minimum testable int: " + smallData.length);
        int[] largeData = TestDataGenerator.generateRandomArray(100000);
        System.out.println("Maximum testable int: " + largeData.length);

        SortingStrategy selectionSort = new SelectionSort();
        SortingStrategy mergeSort = new MergeSort();
        SortingStrategy quickSort = new QuickSort();

        testPerformance(context, smallData, selectionSort, "Selection Sort");
        testPerformance(context, smallData, mergeSort, "Merge Sort");
        testPerformance(context, smallData, quickSort, "Quick Sort");

        testPerformance(context, largeData, selectionSort, "Selection Sort");
        testPerformance(context, largeData, mergeSort, "Merge Sort");
        testPerformance(context, largeData, quickSort, "Quick Sort");
    }

    private static void testPerformance(SortingContext context, int[] data, SortingStrategy strategy, String name) {
        int[] copy = data.clone();
        context.setSortingStrategy(strategy);
        long startTime = System.currentTimeMillis();
        context.sortArray(copy);
        long endTime = System.currentTimeMillis();
        System.out.println(name + " took " + (endTime - startTime) + " milliseconds.");
    }
}
