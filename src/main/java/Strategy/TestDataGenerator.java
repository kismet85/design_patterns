package Strategy;

import java.util.Random;

public class TestDataGenerator {
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100000);
        }
        return array;
    }
}
