import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinzichen on 2016/12/6.
 *
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LengthOfLongestSubstring {
    //If we know that the charset is rather small, we can replace the Map with an integer array.
    //int[26] for Letters 'a' - 'z' or 'A' - 'Z'
    //int[128] for ASCII
    //int[256] for Extended ASCII
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return -1;
        }
        int result = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (charMap.containsKey(s.charAt(j))) {
                i = Math.max(i, charMap.get(s.charAt(j)) + 1);
            }
            charMap.put(s.charAt(j), j);
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}
