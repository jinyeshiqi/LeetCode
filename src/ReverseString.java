/**
 * Created by jinzichen on 2016/12/7.
 *
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] str = s.toCharArray();
        int i = 0, j = str.length - 1;
        while (i < j) {
            char temp = str[j];
            str[j] = str[i];
            str[i] = temp;
            i++;
            j--;
        }
        return String.valueOf(str);
    }
}
