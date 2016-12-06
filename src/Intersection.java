import java.util.HashSet;
import java.util.Set;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class Intersection {
    //Hash table
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        Set<Integer> interSet = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                interSet.add(nums2[i]);
            }
        }
        int[] results = new int[interSet.size()];
        int i = 0;
        for (Integer integer : interSet) {
            results[i] = integer;
            i++;
        }
        return results;
    }

    //Two pointers
//    public int[] intersection(int[] nums1, int[] nums2) {
//        if (nums1 == null || nums2 == null) {
//            return null;
//        }
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i = 0, j = 0;
//        Set<Integer> set = new HashSet<>();
//        while (i < nums1.length && j < nums2.length) {
//            if (nums1[i] < nums2[j]) {
//                i++;
//            } else if (nums1[i] > nums2[j]) {
//                j++;
//            } else {
//                set.add(nums1[i]);
//                i++;
//                j++;
//            }
//        }
//        int[] results = new int[set.size()];
//        int k = 0;
//        for (Integer inter : set) {
//            results[k++] = inter;
//        }
//        return results;
//    }

    //Binary search
//    public int[] intersection(int[] nums1, int[] nums2) {
//        if (nums1 == null || nums2 == null) {
//            return null;
//        }
//        Arrays.sort(nums1);
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums2.length; i++) {
//            int start = 0, end = nums1.length - 1;
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//                if (nums1[mid] == nums2[i]) {
//                    set.add(nums2[i]);
//                    break;
//                } else if (nums1[mid] < nums2[i]) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//        }
//        int[] results = new int[set.size()];
//        int k = 0;
//        for (Integer inter : set) {
//            results[k++] = inter;
//        }
//        return results;
//    }
}
