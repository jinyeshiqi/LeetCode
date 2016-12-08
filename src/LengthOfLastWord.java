/**
 * Created by jinzichen on 2016/12/9.
 *
 * 58. Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null && s.trim().length() == 0) {
            return 0;
        }
        int len = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            len++;
        }
        return len;
    }
}
