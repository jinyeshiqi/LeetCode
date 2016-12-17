import java.util.*;

/**
 * Created by jinzichen on 2016/12/17.
 *
 * 170. Two Sum III - Data structure design
 * https://leetcode.com/problems/two-sum-iii-data-structure-design/
 */
public class TwoSumIII {
    private List<Integer> nums = new ArrayList<>();
    private Map<Integer, Integer> numbers = new HashMap<>();
    private Set<Integer> found = new HashSet<>();

    // Add the number to an internal data structure.
    public void add(int number) {
        if (numbers.containsKey(number)) {
            numbers.put(number, 2);
            found.add(number * 2);
        } else {
            nums.add(number);
            numbers.put(number, 1);
        }
    }

    // Find if there exists any pair of numbers which sum is equal to the value.
    public boolean find(int value) {
        if (found.contains(value)) {
            return true;
        }
        for (int i = 0; i < nums.size(); i++) {
            int num1 = nums.get(i);
            int num2 = value - num1;
            if (num1 != num2 && numbers.containsKey(num2)) {
                found.add(value);
                return true;
            }
        }
        return false;
    }
}
