/**
 * Created by jinzichen on 2016/12/7.
 *
 * 367. Valid Perfect Square
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class IsPerfectSquare {
    //Newton method
    //x(n+1) = (k-1) / k * x(n) + num / (k * pow(x(n), k-1))
    //x(n+1) = (x(n) + num / x(n)) / 2
    public boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }

    //Binary search
//    public boolean isPerfectSquare(int num) {
//        if (num == 1) {
//            return true;
//        }
//        int left = 1, right = num / 2;
//        int mid;
//
//        while (left <= right) {
//            mid = left + (right - left) / 2;
//            long temp = (long)mid * (long)mid;
//            System.out.println(temp);
//            if (num < temp) {
//                right = mid - 1;
//            } else if (num > temp) {
//                left = mid + 1;
//            } else {
//                return true;
//            }
//        }
//
//        return false;
//    }
}
