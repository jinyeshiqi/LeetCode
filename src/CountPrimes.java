/**
 * Created by jinzichen on 2016/12/19.
 *
 * 204. Count Primes
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];
        int count = 0, i = 2;
        for (; i * i < n; i++) {
            if (!isPrimes[i]) {
                count++;
                for (int j = i * i; j < n; j += i) {
                    isPrimes[j] = true;
                }
            }
        }
        for (; i < n; i++) {
            if (!isPrimes[i]) {
                count++;
            }
        }
        return count;
    }
}
