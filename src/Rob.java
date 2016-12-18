/**
 * Created by jinzichen on 2016/12/18.
 *
 * 198. House Robber
 * https://leetcode.com/problems/house-robber/
 */
public class Rob {
    public int rob(int[] nums) {
        int robYes = 0;
        int robNo = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = robNo + nums[i];
            robNo = Math.max(robNo, robYes);
            robYes = temp;
        }
        return Math.max(robNo, robYes);
    }
}
