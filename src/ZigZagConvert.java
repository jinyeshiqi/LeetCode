/**
 * Created by jinzichen on 2016/12/7.
 *
 * 6. ZigZag Conversion
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class ZigZagConvert {
    public String convert(String s, int numRows) {
        if (s == null || s.length() < 3 || numRows == 1) {
            return s;
        }
        char[] str = new char[s.length()];
        int row = 1;
        int flag = 1;
        int step = numRows * 2 - 2;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (j >= s.length()) {
                j = row;
                row++;
                flag = 1;
            }
            str[i] = s.charAt(j);
            if (row == 1 || row == numRows) {
                j = j + step;
            } else {
                int step2 = row * 2 - 2;
                j = flag > 0 ? (j + step - step2) : (j + step2);
                flag = -flag;
            }
        }
        return String.valueOf(str);
    }
}
