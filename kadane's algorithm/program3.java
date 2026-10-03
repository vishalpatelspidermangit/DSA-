/*

Code
Testcase
Testcase
Test Result
152. Maximum Product Subarray
Attempted
Medium
Topics
premium lock icon
Companies
Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.

 

​​​​​​​Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

Constraints: */
public class program3 {
     public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];

        for(int i=1; i<nums.length ; i++){
            int v1 = nums[i];
            int v2 = nums[i]*min;
            int v3 = nums[i]*max;
            max = Math.max(v1, Math.max(v2, v3));
            min = Math.min(v1, Math.min(v2, v3));
            ans = Math.max(ans, max);
        }
        return ans ;

     }
}