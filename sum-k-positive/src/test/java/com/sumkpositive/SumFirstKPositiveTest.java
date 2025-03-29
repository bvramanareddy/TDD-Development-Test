package com.sumkpositive; 
import org.junit.Test;
import static org.junit.Assert.*;

public class SumFirstKPositiveTest {
    @Test
    public void testExampleCase() {
        int[] arr = {-3, 1, 0, 2, -4, 3, 7, -2, 5};
        int k = 3;
        int expected = 6; // 1 + 2 + 3
        assertEquals(expected, SumFirstKPositive.sumFirstKPositive(arr, k));
    }

    @Test
    public void testKEqualsZero() {
        int[] arr = {1, 2, 3};
        int k = 0;
        int expected = 0;
        assertEquals(expected, SumFirstKPositive.sumFirstKPositive(arr, k));
    }

    @Test
    public void testNotEnoughPositiveNumbers() {
        int[] arr = {-1, -2, 3, -4};
        int k = 2;
        try {
            SumFirstKPositive.sumFirstKPositive(arr, k);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testAllNegativeNumbers() {
        int[] arr = {-1, -2, -3};
        int k = 1;
        try {
            SumFirstKPositive.sumFirstKPositive(arr, k);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullArray() {
        SumFirstKPositive.sumFirstKPositive(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeK() {
        int[] arr = {1, 2, 3};
        SumFirstKPositive.sumFirstKPositive(arr, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKGreaterThanArrayLength() {
        int[] arr = {1, 2};
        SumFirstKPositive.sumFirstKPositive(arr, 3);
    }
}