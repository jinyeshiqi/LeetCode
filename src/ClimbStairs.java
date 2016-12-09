import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinzichen on 2016/12/9.
 *
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbStairs {
    Map<Integer, Integer> steps = new HashMap<>();

    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        if (!steps.containsKey(n)) {
            steps.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        }
        return steps.get(n);
    }
}
