import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 205. Isomorphic Strings
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class IsIsomorphic {
    //Map.put() returns the previous value of the existed key
    //Map.containValue with O(n) time
    public boolean isIsomorphic(String s, String t){
        if (s == null || t == null) {
            return false;
        }
        Map<Character, Integer> freqS = new HashMap<>();
        Map<Character, Integer> freqT = new HashMap<>();
        for (Integer i = 0; i < s.length(); i++) {
            if (freqS.put(s.charAt(i), i) != freqT.put(t.charAt(i), i)) {
                return false;
            }
        }
        return true;
    }
}
