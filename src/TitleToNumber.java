/**
 * Created by jinzichen on 2016/12/18.
 *
 * 171. Excel Sheet Column Number
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public class TitleToNumber {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number * 26 + s.charAt(i) - 'A' + 1;
        }
        return number;
    }
}
