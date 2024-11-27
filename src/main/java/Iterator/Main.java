package Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        FibonacciSequence fibonacciSequence = new FibonacciSequence(10);

        Iterator<Integer> iterator = fibonacciSequence.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
