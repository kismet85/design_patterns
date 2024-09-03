package AssertEqualTest;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayEqualityTest {
    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = {2, 3, 5, 7};
        int[] a2 = {2, 3, 5, 7, 8};
        assertFalse(ArrayEquality.areArraysEqual(a1, a2));
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = {{2, 3}, {5, 7}, {11, 13}};
        int[][] a12 = {{2, 3}, {5, 7}, {11, 14}};
        assertFalse(ArrayEquality.areMultidimensionalArraysEqual(a11, a12));
    }

    @Test
    public void testArrayTypes() {
        String[] a1 = {"a", "b", "c"};
        int[][] a11 = {{2, 3}, {5, 7}, {11, 13}};
        assertFalse(ArrayEquality.areArraysOfSameType(a1, a11));
    }
}