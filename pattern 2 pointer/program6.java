/*Given an array arr[] of distinct integers and an integer sum, count the number of unique triplets of elements whose sum is strictly less than sum. A triplet is identified only by the three elements it contains, so different permutations of the same three elements are counted as one triplet.

Examples :

Input: sum = 2, arr[] = [-2, 0, 1, 3]
Output:  2
Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3).  */

import java.util.Arrays;

public class program6 {
    int countTriplets(int sum, int arr[]) {
       int n=arr.length;
       Arrays.sort(arr);
         int count = 0;
         for(int i=0 ; i<n-2; i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k] < sum){
                    count=count+(k-j);
                    j++;
                }
                else {
                    k--;
                }
            }
         }
         return count;
    }
}
