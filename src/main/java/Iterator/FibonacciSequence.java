package Iterator;

import java.util.Iterator;

public class FibonacciSequence implements ISequence {
    private final Integer numbersToGenerate;

    public FibonacciSequence(Integer numbersToGenerate){
        this.numbersToGenerate = numbersToGenerate;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(numbersToGenerate);
    }
}