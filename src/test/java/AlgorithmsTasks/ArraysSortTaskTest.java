package AlgorithmsTasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysSortTaskTest {

@Test
public void testArraysSortWithEmptyArray() {
    int[] array = new int[0];
    int[] expected = new int[0];
    Arrays.sort(array);
    Assert.assertArrayEquals(expected, array);
}

@Test
public void testArraySortClassic() {
    int[] array = new int[] {0, 66, -2, -44, 100, 0};
    int[] expected = new int[] {-44, -2, 0, 0, 66, 100};
    Arrays.sort(array);
    Assert.assertArrayEquals(expected, array);
}

@Test
public void testArraySortWithNull() { // не проходит ни с одной комбинацией
    Integer[] array = new Integer[] {3, 100, -4, null};
    Integer[] expected = new Integer[] {null, -4, 3, 100};
    Integer[] expected2 = new Integer[] {-4, 3, 100, null};
    Arrays.sort(array);
    Assert.assertArrayEquals(expected2, array);
}

@Test
public void testArraySortWithNullOnly() { // прошел
    Integer[] array = new Integer[] {null};
    Integer[] expected = new Integer[] {null};
    Arrays.sort(array);
    Assert.assertArrayEquals(expected, array);
    }

@Test
// прошел, но не очень понятно, как в принципе должны сравниваться символы разных алфавитов
// То есть я, конечно, понимаю логику, по которой сравниваются, но имеет свою специфику
    public void testArraySortOfSymbols() {
    char[] array = new char[] {' ', 's', 'ф', 'წ', 's'};
    char[] expected = new char[] {' ', 's', 's', 'ф', 'წ'};
    Arrays.sort(array);
    Assert.assertArrayEquals(array, expected);
}

@Test
public void testArraySortOfSymbolsBigAndSmall() { // не прошел (понимаю, почему не прошел)
    char[] array = new char[] {'A', 'a', 'B', 'b', 'f'};
    char[] expected = new char[] {'A', 'a', 'B', 'b', 'f'};
    Arrays.sort(array);
    Assert.assertArrayEquals(array, expected);
    }

}