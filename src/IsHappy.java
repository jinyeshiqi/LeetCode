import java.util.HashSet;
import java.util.Set;

/**
 * Created by jinzichen on 2016/12/18.
 *
 * 202. Happy Number
 * https://leetcode.com/problems/happy-number/
 */
public class IsHappy {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int temp = 0;
            while (n > 0) {
                temp += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (temp == 1) {
                return true;
            }
            n = temp;
        }
        return false;
    }
}
