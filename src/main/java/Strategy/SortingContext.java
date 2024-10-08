package Strategy;

public class SortingContext {
    private SortingStrategy strategy;

    public void setSortingStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        if (strategy != null) {
            strategy.sort(array);
        }
    }
}
