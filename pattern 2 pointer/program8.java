/*  Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

 

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program8 {
  public List<List<Integer>> fourSum(int[] nums, int target) {
  List<List<Integer>> result = new ArrayList<>();
 int n = nums.length;
 Arrays.sort(nums);

  for(int a=0 ; a<n-3 ; a++){
    if(a>0 && nums[a]==nums[a-1])continue;

    for(int b=a+1 ; b<n-2 ; b++){
        if(b>0 && nums[b]==nums[b-1])continue;
        int c = b+1;
        int d = n-1;
        while(c<d){
            long sum = nums[a]+nums[b]+nums[c]+nums[d];
            if(sum==target){
                result.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                while (c>0 && nums[c]==nums[c-1]) c++;
                while (d>0 && nums[d]==nums[d-1]) d++;

            }
            else if (sum<target){
                c++;
            }
            else d--;
        }
    }
  }
 return result;
}    
}
