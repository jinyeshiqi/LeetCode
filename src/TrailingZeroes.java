/**
 * Created by jinzichen on 2016/12/18.
 *
 * 172. Factorial Trailing Zeroes
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 * https://en.wikipedia.org/wiki/Trailing_zero
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int result = 0;
        int q = n / 5;
        while (q > 0) {
            result += q;
            q /= 5;
        }
        return result;

        //return (n == 0) ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
