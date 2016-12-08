import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinzichen on 2016/12/9.
 *
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInt {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int postNum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = romanMap.get(s.charAt(i));
            if (num < postNum) {
                result = result - num;
            } else {
                result = result + num;
            }
            postNum = num;
        }
        return result;
    }
}
