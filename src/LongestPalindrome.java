/**
 * Created by jinzichen on 2016/12/6.
 *
 * 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindrome {
    int begin = 0;
    int length = 0;
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome(s, i, i + 1);
            } else {
                isPalindrome(s, i, i);
            }
        }
        return s.substring(begin, begin + length);
    }

    private void isPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i--) != s.charAt(j++)) {
                break;
            }
        }
        if ((j - i - 1) > length) {
            begin = i + 1;
            length = j - i - 1;
        }
    }
}
