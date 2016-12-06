/**
 * Created by jinzichen on 2016/12/7.
 *
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int indexL = 0;
        int indexR = nums.length - 1;
        int indexM;

        while (indexL <= indexR) {
            indexM = indexL + (indexR - indexL) / 2;
            if (target < nums[indexM]) {
                indexR = indexM - 1;
            } else if (target > nums[indexM]) {
                indexL = indexM + 1;
            } else {
                return indexM;
            }
        }

        return indexL;
    }
}
