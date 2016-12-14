import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinzichen on 2016/12/15.
 *
 * 119. Pascal's Triangle II
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> line = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            line.add(0, 1);
            for (int j = 1; j < i; j++) {
                line.set(j, line.get(j) + line.get(j + 1));
            }
        }
        return line;
    }
}
