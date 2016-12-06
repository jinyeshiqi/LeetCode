/**
 * Created by jinzichen on 2016/12/7.
 *
 * 151. Reverse Words in a String
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWords {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] strArr = s.trim().replaceAll("\\s+", " ").toCharArray();
        int i, j;
        for (i = 0, j = 0; j < strArr.length; j++) {
            if (strArr[j] == ' ') {
                reverse(strArr, i, j - 1);
                i = j + 1;
            }
        }
        if (i < j) {
            reverse(strArr, i, j - 1);
        }
        reverse(strArr, 0, j - 1);

        return String.valueOf(strArr).trim();
    }

    private void reverse(char[] str, int i, int j) {
        while (i < j) {
            char temp = str[j];
            str[j] = str[i];
            str[i] = temp;
            i++;
            j--;
        }
    }

//    public String reverseWords(String s) {
//        if (s == null || s.length() == 0) {
//            return s;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        String[] strArr = s.trim().split("\\s+");
//        for (int i = strArr.length - 1; i >0; i--) {
//            sb.append(strArr[i] + " ");
//        }
//
//        sb.append(strArr[0]);
//
//        return sb.toString();
//    }

    //With multiple spaces
//    public String reverseWords(String s) {
//        if (s == null || s.length() == 0) {
//            return s;
//        }
//
//        char[] strArr = s.toCharArray();
//        for (int end = 0, start = 0; end < strArr.length; end++) {
//            if (strArr[end] == ' ') {
//                if (start == end) {
//                    start++;
//                } else {
//                    reverse(strArr, start, end - 1);
//                    start = end + 1;
//                }
//            } else if (end == strArr.length - 1) {
//                reverse(strArr, start, end);
//            }
//        }
//        reverse(strArr, 0, strArr.length - 1);
//
//        return String.valueOf(strArr);
//    }
//
//    private void reverse(char[] str, int i, int j) {
//        while (i < j) {
//            char temp = str[j];
//            str[j] = str[i];
//            str[i] = temp;
//            i++;
//            j--;
//        }
//    }
}
