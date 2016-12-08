import java.util.HashSet;
import java.util.Set;

/**
 * Created by jinzichen on 2016/12/9.
 *
 * 36. Valid Sudoku
 * https://leetcode.com/problems/valid-sudoku/
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null) {
            return false;
        }
        for (int i = 0; i < 9; i++) {
            if (!isValid(board, i, i, 0, 8)) {
                return false;
            }
            if (!isValid(board, 0, 8, i, i)) {
                return false;
            }
            int j = i / 3 * 3;
            int k = i % 3 * 3;
            if (!isValid(board, j, j + 2, k, k + 2)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row1, int row2, int col1, int col2) {
        Set<Character> set = new HashSet<>();
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                if (board[i][j] != '.' && !set.add(board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
