/**
 * Created by jinzichen on 2016/12/7.
 *
 * 231. Power of Two
 * https://leetcode.com/problems/power-of-two/
 */
public class IsPowerOfTwo {
    //HammingWeight method
//    public boolean isPowerOfTwo(int n) {
//        boolean flag = false;
//        while (n > 0) {
//            if ((n & 1) != 0 && (n >> 1) != 0) {
//                return false;
//            }
//            n = n >> 1;
//            flag = true;
//        }
//
//        return flag;
//    }

    //Bit manipulation trick
    //0100 & 0011 = 0000
    public boolean isPowerOfTwo(int n) {
        if (n > 0) {
            return (n & (n - 1)) == 0;
        }
        return false;
    }
}
