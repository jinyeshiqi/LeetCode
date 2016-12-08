/**
 * Created by jinzichen on 2016/12/9.
 *
 * 27. Remove Element
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                }
                j--;
            } else {
                i++;
            }
        }
        return j + 1;
    }
}
