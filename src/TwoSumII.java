/**
 * Created by jinzichen on 2016/12/7.
 *
 * 167. Two Sum II - Input array is sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumII {
    //Two-pointer technique
    public int[] twoSumII(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int temp = numbers[i] + numbers[j];
            if (temp < target) {
                i++;
            } else if (temp > target) {
                j--;
            } else {
                return new int[]{i + 1, j + 1};
            }

        }

        return new int[]{-1, -1};
    }
}