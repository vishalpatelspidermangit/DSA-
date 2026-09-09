//Remove Duplicates from Sorted List

//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
import java.util.Vector;

public class program3 {
    public int[] sortedSquares(int[] nums) {
        Vector<Integer> a = new Vector<>(); // negatives, ascending
        Vector<Integer> b = new Vector<>(); // non-negatives, ascending

        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] < 0) {
                a.add(nums[idx]);
            } else {
                b.add(nums[idx]);
            }
        }

        int n = a.size();
        int m = b.size();
        int[] res = new int[n + m];

        int i = n - 1; // walk 'a' backward -> smallest |negative| first
        int j = 0;     // walk 'b' forward  -> already smallest first
        int k = 0;     // result index

        while (i >= 0 && j < m) {
            int aSq = a.get(i) * a.get(i);
            int bSq = b.get(j) * b.get(j);
            if (aSq <= bSq) {
                res[k++] = aSq;
                i--;
            } else {
                res[k++] = bSq;
                j++;
            }
        }

        while (i >= 0) {          // leftover negatives
            res[k++] = a.get(i) * a.get(i);
            i--;
        }

        while (j < m) {           // leftover positives
            res[k++] = b.get(j) * b.get(j);
            j++;
        }

        return res;
    }
}