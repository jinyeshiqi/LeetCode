import java.util.Arrays;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 164. Maximum Gap
 * https://leetcode.com/problems/maximum-gap/
 */
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int min = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if (max == min) {
            return 0;
        }
        int[] bucketMins = new int[nums.length];
        int[] bucketMaxs = new int[nums.length];
        Arrays.fill(bucketMins, -1);
        Arrays.fill(bucketMaxs, -1);

        int gap = (int)Math.ceil((double)(max - min) / (nums.length - 1));
        for (int i = 0; i < nums.length; i++) {
            int index = (nums[i] - min) / gap;
            if (bucketMins[index] == -1) {
                bucketMins[index] = nums[i];
                bucketMaxs[index] = nums[i];
            } else {
                bucketMins[index] = Math.min(bucketMins[index], nums[i]);
                bucketMaxs[index] = Math.max(bucketMaxs[index], nums[i]);
            }
        }

        int maxGap = 0;
        int preMax = bucketMaxs[0];
        for (int i = 1; i < nums.length; i++) {
            if (bucketMins[i] != -1) {
                maxGap = Math.max(maxGap, bucketMins[i] - preMax);
                preMax = bucketMaxs[i];
            }
        }
        return maxGap;
    }
}
