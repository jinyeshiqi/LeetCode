/**
 * Created by jinzichen on 2016/12/7.
 *
 * 186. Reverse Words in a String II
 * https://leetcode.com/problems/reverse-words-in-a-string-ii/
 */
public class ReverseWordsII {
    public void reverseWords(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int i = 0;
        for (int j = 0; j < s.length; j++) {
            if (s[j] == ' ') {
                reverse(s, i, j - 1);
                i = j + 1;
            }
        }
        reverse(s, i, s.length - 1);
        reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }
}
