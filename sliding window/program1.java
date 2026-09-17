/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint. */

public class program1 {
    public int minSubArrayLen(int target, int[] nums) {
         int low = 0 , high =0 , res = Integer.MAX_VALUE , sum = 0 ;
         while (high<nums.length) {
       sum = sum+nums[high];
       while (sum>=target) {
        int len = high-low + 1 ;
        res = Math.min(res, len);
        sum= sum - nums[low];
        low++;
       }     
       high++;
         } 
         return res == Integer.MAX_VALUE? 0 : res ;

    }
}
