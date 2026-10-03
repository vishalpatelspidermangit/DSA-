/*
Minimum Sum Subarray
Difficulty: MediumAccuracy: 72.37%Submissions: 44K+Points: 4Average Time: 15m
Given an array arr[], find the sub-array containing at least one number which has the minimum sum and return its sum.

Examples :

Input: arr[] = [3,-4, 2,-3,-1, 7,-5]
Output: -6
Explanation: The subarray is [-4,2,-3,-1] = -6
Input: arr[] = [2, 6, 8, 1, 4]
Output: 1
Explanation: The subarray is [1] = 1 */
public class program2 {
    public int minSubarraySum(int[] arr){
          int currentSum = arr[0];
          int minsum = arr[0];
          for(int i=1; i<arr.length ; i++){
            currentSum = Math.min(arr[i],currentSum + arr[i] );
            minsum = Math.min(currentSum,minsum );
          }
          return minsum;
    }
}
