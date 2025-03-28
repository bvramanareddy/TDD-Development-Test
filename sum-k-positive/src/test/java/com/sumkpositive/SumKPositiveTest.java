package com.sumkpositive;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumKPositiveTest {
    @Test
    // Thi is Red Phase it is returning 0 instead of 6 , This will fail.
    public void testAllPositiveNumbers() 
    {
        SumKPositive calculator = new SumKPositive();
        int[] numbers = {1, 2, 3};
        int result = calculator.sumFrstKPositive(numbers, 3);
        assertEquals(6, result);
    }
    @Test
    public void testKSmallerThanArray() 
    {
    SumKPositive calculator = new SumKPositive();
    int[] numbers = {5, 2, 3};
    int result = calculator.sumFrstKPositive(numbers, 2);
    assertEquals(7, result); // 5 + 2 = 7
    }
    @Test
    public void testWithNegativeNumbersAndZero()
    {
    SumKPositive calculator = new SumKPositive();
    int[] numbers = {-1, 2, 0, 3, -4, 7, -9};
    int result = calculator.sumFrstKPositive(numbers, 3);
    assertEquals(12, result);  // 2+3+7= 12
    }
}