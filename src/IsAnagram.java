import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 */
public class IsAnagram {
    //Hash-table and Unicode characters
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
            } else {
                freq.put(s.charAt(i), 1);
            }
            if (freq.containsKey(t.charAt(i))) {
                freq.put(t.charAt(i), freq.get(t.charAt(i)) - 1);
            } else {
                freq.put(t.charAt(i), -1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
