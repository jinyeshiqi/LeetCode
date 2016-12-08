/**
 * Created by jinzichen on 2016/12/9.
 *
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int longest = strs[0].length();
        for (String str : strs) {
            if (longest == 0) {
                return "";
            }
            int i = 0;
            while (i < str.length() && i < longest) {
                if (strs[0].charAt(i) != str.charAt(i)) {
                    break;
                }
                i++;
            }
            longest = i;
        }
        return strs[0].substring(0, longest);
    }
}
