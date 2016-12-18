import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinzichen on 2016/12/19.
 *
 * 219. Contains Duplicate II
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer prev = map.put(nums[i], i);
            if (prev != null) {
                if (i - prev <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
