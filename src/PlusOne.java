/**
 * Created by jinzichen on 2016/12/9.
 *
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int count = 1;
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                count = 0;
                break;
            }
            digits[i] = 0;
        }
        if (count == 1) {
            int[] nums = new int[len+1];
            for (int i = 0; i < len; i++) {
                nums[i+1] = digits[i];
            }
            nums[0] = 1;
            return nums;
        }
        return digits;
    }
}
