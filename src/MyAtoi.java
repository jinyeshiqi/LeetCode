/**
 * Created by jinzichen on 2016/12/7.
 *
 * 8. String to Integer (atoi)
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class MyAtoi {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        int flag = 1, i = 0;
        long num = 0;
        if (str.charAt(0) == '-') {
            flag = -flag;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        while (i < str.length()) {
            int temp = str.charAt(i++) - '0';
            if (temp < 0 || temp > 9) {
                break;
            }
            num = num * 10 + temp * flag;
            if (num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)num;
    }
}
