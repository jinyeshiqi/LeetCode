import java.util.HashSet;
import java.util.Set;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 345. Reverse Vowels of a String
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowels {
    //String contains: O(n)
    //HashSet contains: O(1)
    public String reverseVowels(String s) {
        if (s == null) {
            return s;
        }
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
        char[] str = s.toCharArray();
        int i = 0, j = str.length - 1;
        while (i < j) {
            if (!vowels.contains(str[i])) {
                i++;
            }
            if (!vowels.contains(str[j])) {
                j--;
            }
            if (vowels.contains(str[i]) && vowels.contains(str[j])) {
                char temp = str[j];
                str[j] = str[i];
                str[i] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(str);
    }
}
