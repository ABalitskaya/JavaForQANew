package AlgorithmsTasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class AlgorithmTaskTest {

    private final AVG salaryAverage = new AVG();


    @Test
    public void testAverageEmpty() {
        int[] empty = new int[] {1000};
        assertEquals(null, salaryAverage.average(empty));

    }

    @Test
    public void testAverageOnlyOneElementInArray() {
        int[] single = new int[] {1000};
        assertEquals(null, salaryAverage.average(single));

    }

    @Test
    public void testPositiveAverage() {
        int[] single = new int[] {1000, 2000, 3000, 8000, 6000, 5000, 45900};
        assertEquals(Double.valueOf(4800.0), salaryAverage.average(single));

    }

    @Test
    public void testSort() {
        int[] array = new int[] {3,5,7,2,0,1,33,678,9};
        int[] expected = new int[] {0,1,2,3,5,7,9,33,678};
        Arrays.sort(array);
        Assert.assertArrayEquals(expected, array);
    }

    @Test
    public void testSortNull() {
        int[] array = new int[0];
        int[] expected = new int[]{};
        Arrays.sort(array);
        assertSame(null, null);
    }

}