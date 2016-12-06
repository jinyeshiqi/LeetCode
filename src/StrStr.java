/**
 * Created by jinzichen on 2016/12/7.
 *
 * 28. Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 */
public class StrStr {
    //KMP Substring Search
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return 0;
        }
        if (needle.length() == 0) {
            return 0;
        } else if (needle.length() > haystack.length()) {
            return -1;
        }

        int[] arrKMP = getKMP(needle);

        for (int i = 0, j = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                j = arrKMP[j-1];
            }
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }

        return -1;
    }

    //Calculate the KMP array
    private int[] getKMP(String needle) {
        int[] arrKMP = new int[needle.length()];
        arrKMP[0] = 0;

        for (int i = 1, j = 0; i < needle.length(); i++) {
            while (j > 0 && needle.charAt(j) != needle.charAt(i)) {
                j = arrKMP[j-1];
            }
            if (needle.charAt(j) == needle.charAt(i)) {
                j++;
            }
            arrKMP[i] = j;
        }

        return arrKMP;
    }
}
