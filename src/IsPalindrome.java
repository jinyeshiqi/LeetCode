/**
 * Created by jinzichen on 2016/12/7.
 *
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = 1;
        while (x / n >= 10) {
            n = n * 10;
        }
        while (x > 0) {
            if (x / n != x % 10) {
                return false;
            }
            x = x % n;
            x = x / 10;
            n = n / 100;
        }
        return true;
    }
}