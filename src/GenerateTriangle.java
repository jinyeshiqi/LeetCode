import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinzichen on 2016/12/15.
 *
 * 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 */
public class GenerateTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            line.add(0, 1);
            for (int j = 1; j < i; j++) {
                line.set(j, line.get(j) + line.get(j + 1));
            }
            results.add(new ArrayList<>(line));
        }
        return results;
    }
}
