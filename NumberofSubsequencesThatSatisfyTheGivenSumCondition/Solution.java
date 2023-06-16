package NumberofSubsequencesThatSatisfyTheGivenSumCondition;

import java.util.Arrays;

public class Solution 
{
    /**
     * Count the number of subsequences where the smallest element plus the biggest element is smaller than target
     * @param nums
     * @param target
     * @return
     */
    public static int numSubseq (int[] nums, int target)
    {
        // sort array 
        Arrays.sort(nums);

        int result = 0;

        // perform binary search to find the bigger pointer
        int p1 = 0;
        int p2 = binarySearch(nums, p1, target, 0, nums.length - 1);

        

        return 0;
    }

    /**
     * Perform binary search
     * @param arr array bs is performed on
     * @param i smaller pointer
     * @param tar needed for searching
     * @param s the smaller pointer for bs
     * @param b the bigger poitner for bs
     * @return
     */
    private static int binarySearch (int[] arr, int i, int tar, int s, int b)
    {
        if (s == b)
        {
            return s;
        }
        else 
        {
            int mid = (s + b) / 2;
            if (arr[i] + arr[mid] < tar)
            {
                return binarySearch(arr, i, tar, s, mid);
            }
            else
            {
                return binarySearch(arr, i, tar, mid, b);
            }
        }
    }
    
    /**
     * Given the length, return the number of subsequents
     * @param length
     * @return
     */
    private static int countSubseq (int length)
    {
        
    }
}
