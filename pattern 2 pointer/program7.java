/*  dutch national flag algo
 you are given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]

Output: [0,0,1,1,2,2]*/

import java.util.Arrays;

public class program7 {
    public void sortColors(int[] nums) {
        int start =0;
        int middle=0;
        int end=nums.length-1;

        while(middle<=end){
            if(nums[middle]==0){
             int temp = nums[start];
             nums[start]=nums[middle];
             nums[middle]=temp;
             start++;
             middle++;
            }
            else if (nums[middle]==1){
                middle++;
            }
            else{
                int temp =nums[middle];
                nums[middle]=nums[end];
                nums[end]=temp;
                end--;

            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
