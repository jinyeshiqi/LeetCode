/**
 * Created by jinzichen on 2016/12/17.
 *
 * 168. Excel Sheet Column Title
 * https://leetcode.com/problems/excel-sheet-column-title/
 */
public class ConverToTitle {
    public String converToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n = n - 1;
            sb.append((char)('A' + n % 26));
            n = n / 26;
        }
        return sb.reverse().toString();
    }
}
