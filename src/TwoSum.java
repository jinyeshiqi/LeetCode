import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinzichen on 2016/12/5.
 *
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (numsMap.containsKey(t)) {
                return new int[] {numsMap.get(t), i};
            }
            numsMap.put(nums[i], i);
        }

        return new int[] {0, 0};
    }
}
