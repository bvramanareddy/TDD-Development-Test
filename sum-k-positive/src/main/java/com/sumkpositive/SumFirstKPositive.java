package com.sumkpositive;

public class SumFirstKPositive {
    public static int sumFirstKPositive(int[] arr, int k) {
        // Input validation
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (k < 0) {
            throw new IllegalArgumentException("k cannot be negative");
        }
        if (k > arr.length) {
            throw new IllegalArgumentException("k cannot be larger than array length");
        }

        // If k is 0, return 0
        if (k == 0) {
            return 0;
        }

        // Find the first k positive numbers and compute their sum
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
                count++;
                if (count == k) {
                    break;
                }
            }
        }

        // Check if we found enough positive numbers
        if (count < k) {
            throw new IllegalArgumentException("Not enough positive numbers in the array");
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test the example
        int[] arr = {-3, 1, 0, 2, -4, 3, 7, -2, 5};
        int k = 3;
        int result = sumFirstKPositive(arr, k);
        System.out.println("Sum of first " + k + " positive numbers: " + result);
    }
}