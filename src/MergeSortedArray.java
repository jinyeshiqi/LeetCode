/**
 * Created by jinzichen on 2016/12/9.
 *
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (j >= 0) {
            if (i < 0) {
                nums1[last] = nums2[j];
                j--;
            } else if (nums2[j] < nums1[i]) {
                nums1[last] = nums1[i];
                i--;
            } else {
                nums1[last] = nums2[j];
                j--;
            }
            last--;
        }
    }
}
