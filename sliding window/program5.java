/*3. Longest Substring Without Repeating Characters
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers. */

import java.util.HashMap;
import java.util.Map;

public class program5 {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        int left = 0, maxLen = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            // if char already seen, move left pointer after its last occurrence
            if (lastIndex.containsKey(c)) {
                left = Math.max(left, lastIndex.get(c) + 1);
            }

            lastIndex.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

        
    }

