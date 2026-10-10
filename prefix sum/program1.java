
/*
560. Subarray Sum Equals K
Medium
Topics
premium lock icon
Companies
Hint
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2 */
import java.util.HashMap;

public class program1 {
      public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count =0;
        int sum =0;
     map.put(0, 1);
     for(int num:nums){
      sum = sum + num;
     if(map.containsKey(sum-k)){
      count =count+ map.get(sum-k);
     }
     map.put(sum, map.getOrDefault(sum, 0)+1);

     }
     return count;
    }
  
}
