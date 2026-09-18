/*Longest Substring with K Uniques
Difficulty: MediumAccuracy: 34.65%Submissions: 339K+Points: 4
You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

Note : If no such substring exists, return -1. 

Examples:

Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'. */

import java.util.HashMap;
import java.util.Map;

public class program3 {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int low = 0, res = -1;
        Map<Character, Integer> freq = new HashMap<>();

        for (int high = 0; high < n; high++) {
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // shrink window if more than k unique
            while (freq.size() > k) {
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0)
                    freq.remove(leftChar);
                low++;
            }

            // if exactly k unique, update answer
            if (freq.size() == k) {
                res = Math.max(res, high - low + 1);
            }
        }

        return res;

    }
}
