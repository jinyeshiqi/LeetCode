import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 */
public class IsValidBrackets {
    public boolean isValidBrackets(String s) {
        if (s == null) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('(', ')');
        charMap.put('[', ']');
        charMap.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    brackets.push(s.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    if (brackets.isEmpty() || charMap.get(brackets.pop()) != s.charAt(i)) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        return brackets.isEmpty();
    }
}