import java.util.*;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 126. Word Ladder II
 * https://leetcode.com/problems/word-ladder-ii/
 */
public class FindLadders {
    //BFS
    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
        List<List<String>> results = new LinkedList<>();

        wordList.remove(beginWord);
        wordList.add(endWord);

        Queue<List<String>> wordPaths = new LinkedList<>();
        List<String> tPath = new LinkedList<>();
        tPath.add(beginWord);
        wordPaths.add(tPath);

        Set<String> checkedWords = new HashSet<>();
        boolean found = false;
        while (!wordPaths.isEmpty()) {
            if (found) {
                break;
            }
            wordList.removeAll(checkedWords);
            checkedWords.clear();

            int level = wordPaths.size();
            for (int i = 0; i < level; i++) {
                List<String> path = wordPaths.poll();
                char[] word = path.get(path.size()-1).toCharArray();
                for (int j = 0; j < word.length; j++) {
                    char old = word[j];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        word[j] = ch;
                        String newWord = String.valueOf(word);
                        if (wordList.contains(newWord)) {
                            checkedWords.add(newWord);
                            List<String> newPath = new LinkedList<>(path);
                            newPath.add(newWord);
                            if (newWord.equals(endWord)) {
                                results.add(newPath);
                                found = true;
                            } else {
                                wordPaths.add(newPath);

                            }
                        }
                    }
                    word[j] = old;
                }
            }
        }
        return results;
    }
}
