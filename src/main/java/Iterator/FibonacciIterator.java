package Iterator;

import java.util.Iterator;

import java.util.NoSuchElementException;
public class FibonacciIterator implements Iterator<Integer> {
    private int num = 1;
    private int nextNum = 1;
    private int count = 0;
    private final int numbersToBeGenerated;

    public FibonacciIterator(int numbersToBeGenerated) {
        this.numbersToBeGenerated = numbersToBeGenerated;
    }

    @Override
    public boolean hasNext() {
        return count < numbersToBeGenerated;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the sequence.");
        }
        int current = num;
        int newNumber = num + nextNum;
        num = nextNum;
        nextNum = newNumber;
        count++;
        return current;
    }
}