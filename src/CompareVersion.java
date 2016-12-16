/**
 * Created by jinzichen on 2016/12/17.
 *
 * 165. Compare Version Numbers
 * https://leetcode.com/problems/compare-version-numbers/
 */
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length(), len2 = version2.length();
        int i = 0, j = 0;
        while (i < len1 || j < len2) {
            int ver1 = 0, ver2 = 0;
            while (i < len1 && version1.charAt(i) != '.') {
                ver1 = ver1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while (j < len2 && version2.charAt(j) != '.') {
                ver2 = ver2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            if (ver1 > ver2) {
                return 1;
            } else if (ver1 < ver2) {
                return -1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
