/**
 * Created by jinzichen on 2016/12/15.
 *
 * 157. Read N Characters Given Read4
 * https://leetcode.com/problems/read-n-characters-given-read4/
 */
//public class ReadN extends Reader4 {
public class ReadN {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        char[] buffer = new char[4];
        int total = 0;
        while (total < n) {
            int len = read4(buffer);
            int length = Math.min(n - total, len);
            for (int i = 0; i < length; i++) {
                buf[total + i] = buffer[i];
            }
            total = total + length;
            if (len < 4) {
                break;
            }
        }
        return total;
    }

    private int read4(char[] buf) {
        return 0;
    }
}
