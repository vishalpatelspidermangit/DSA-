//Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

public class program2 {
    
    void segregate0and1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }


}