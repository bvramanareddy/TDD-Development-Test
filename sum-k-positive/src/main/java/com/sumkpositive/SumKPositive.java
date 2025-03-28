package com.sumkpositive;

    /*
     * Sums the first k positive numbers in an array, It will not consider the -ve numbers now.
     * @param numbers Array of integers
     * @param k Number of positive elements to sum
     * @return Sum of the first k positive numbers
     */
public class SumKPositive 
{
    public int sumFrstKPositive(int[] nums, int k)
    {
        int sum= 0;
        int positiveCount= 0;

        for(int i=0; i<nums.length && positiveCount<k ;i++)
        {
            if (nums[i]>0) {
                sum+=nums[i];
                positiveCount++;
            }
        }
        return sum; 
    }
}