/**
 * Created by jinzichen on 2016/12/9.
 *
 * 38. Count and Say
 * https://leetcode.com/problems/count-and-say/
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n < 1) {
            return "1";
        }
        StringBuilder result = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            int count = 1;
            int len = result.length();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < len - 1; j++) {
                if (result.charAt(j) == result.charAt(j+1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(len-1));
            result = sb;
        }
        return result.toString();
    }
}
