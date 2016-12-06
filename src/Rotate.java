/**
 * Created by jinzichen on 2016/12/7.
 *
 * 189. Rotate Array
 * https://leetcode.com/problems/rotate-array/
 */
public class Rotate {
    //Solution 1
//    public void rotate(int[] nums, int k) {
//        if (nums == null || nums.length == 1) {
//            return;
//        }
//        int len = nums.length;
//        for (int i = 0; i < k; i++) {
//            int temp = nums[len-1];
//            for (int j = len-1; j > 0; j--) {
//                nums[j] = nums[j-1];
//            }
//            nums[0] = temp;
//        }
//    }

    //Solution 2
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 1) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }

    //Solution 3
//    public void rotate(int[] nums, int k) {
//        if (nums == null || nums.length == 1) {
//            return;
//        }
//        k = k % nums.length;
//        int[] temp = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int j = (nums.length - k + i) % nums.length;
//            temp[i] = nums[j];
//        }
//        System.arraycopy(temp, 0, nums, 0, nums.length);
//    }
}
