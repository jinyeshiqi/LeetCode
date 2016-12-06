/**
 * Created by jinzichen on 2016/12/7.
 *
 * 34. Search for a Range
 * https://leetcode.com/problems/search-for-a-range/
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;
        int left = 0, right = nums.length - 1;
        int mid;

        //Find start position
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                if (mid == 0 || target != nums[mid-1]) {
                    start = mid;
                    break;
                }
                right = mid - 1;
            }
        }

        //Find end position
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                if (mid == nums.length - 1 || target != nums[mid+1]) {
                    end = mid;
                    break;
                }
                left = mid + 1;
            }
        }

        return new int[]{start, end};
    }
}
