/**
 * Created by jinzichen on 2016/12/7.
 *
 * 136. Single Number
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    //Bit manipulation
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    //Hash-table
//    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> times = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (times.containsKey(nums[i])) {
//                times.put(nums[i], times.get(nums[i]) + 1);
//            } else {
//                times.put(nums[i], 1);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : times.entrySet()) {
//            if (entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//
//        return 0;
//    }
}
