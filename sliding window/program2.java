/*Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.

Examples:

Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum. */

public class program2 {
    public int maxSubarraySum(int[] arr, int k) {

           int sum =0 , low = 0 , high = k-1;
          for (int i = low ; i<=high ; i++){
            sum = sum + arr[i];
          }
          int res = sum ;
          while (high<arr.length) {
            res = Math.max(res , sum);
              low++;
              high++;
              if(high==arr.length) break;
              sum = sum - arr[low-1];
              sum = sum + arr[high];
          }
          return  res ; 

    }
   
}
