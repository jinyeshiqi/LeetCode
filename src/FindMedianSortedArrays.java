/**
 * Created by jinzichen on 2016/12/6.
 *
 * 4. Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int k = (m + n) / 2;
        if ((m + n) % 2 == 0) {
            return (findMedian(nums1, 0, m, nums2, 0, n, k) + findMedian(nums1, 0, m, nums2, 0, n, k + 1)) / 2;
        } else {
            return findMedian(nums1, 0, m, nums2, 0, n, k + 1);
        }
    }

    private double findMedian(int[] nums1, int start1, int len1, int[] nums2, int start2, int len2, int k) {
        if (len1 > len2) {
            return findMedian(nums2, start2, len2, nums1, start1, len1, k);
        }
        if (len1 == 0) {
            return nums2[start2 + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        int p = Math.min(len1, k / 2);
        int q = k - p;
        if (nums1[start1 + p - 1] < nums2[start2 + q - 1]) {
            return findMedian(nums1, start1 + p, len1 - p, nums2, start2, q, k - p);
        } else if (nums1[start1 + p - 1] > nums2[start2 + q - 1]) {
            return findMedian(nums1, start1, p, nums2, start2 + q, len2 - q, k - q);
        } else {
            return nums1[start1 + p - 1];
        }
    }
}
