/**
 * Created by jinzichen on 2016/12/7.
 *
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    //Two-pointer technique
    public int removeDuplicates(int[] nums) {
        //Notice the case that no elements in the array
        if (nums.length == 0) {
            return 0;
        }

        //No need to create 'count'
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];  //Use the result after i + 1
            }
        }

        return i + 1;
    }
}