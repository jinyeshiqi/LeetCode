import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 127. Word Ladder
 * https://leetcode.com/problems/word-ladder/
 */
public class LadderLength {
    //BFS
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        int len = 1;
        Queue<String> wordQueue = new LinkedList<>();
        wordQueue.offer(beginWord);
        wordList.add(endWord);

        while (!wordQueue.isEmpty()) {
            int size = wordQueue.size();
            for (int i = 0; i < size; i++) {
                String str = wordQueue.poll();
                if (str.equals(endWord)) {
                    return len;
                }
                char[] chars = str.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char old = chars[j];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[j] = ch;
                        String s = String.valueOf(chars);
                        if (wordList.remove(s)) {
                            wordQueue.offer(s);
                        }
                    }
                    chars[j] = old;
                }
            }
            len++;
        }

        return 0;
    }
}
