/**
 * Created by jinzichen on 2016/12/7.
 *
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInt {
    public int reverseInt(int x) {
        long result = 0;

        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)result;
    }
}
