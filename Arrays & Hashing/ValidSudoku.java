import java.util.HashMap;
import java.util.HashSet;
//Hashmap for row, col, box (box key should be r/3, c/3)
//Make sure to use .putIfAbsent(x, new HashSet<>()); in case a set has not been initialized yet
//Make sure to skip past values if empty. ‘.’
//Add to hashmap by xxx.get().add()

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> row = new HashMap<>(); //key: r
        HashMap<Integer, Set<Character>> col = new HashMap<>(); //key: c
        HashMap<String, Set<Character>> box = new HashMap<>(); //key : r/3, c/3
            for (int r = 0; r < 9; r++) { // rows
                for (int c = 0; c < 9; c++) { // cols
                    if (board[r][c] != '.') {
                        row.putIfAbsent(r, new HashSet<>());
                        col.putIfAbsent(c, new HashSet<>());
                        if (row.get(r).contains(board[r][c])|| col.get(c).contains(board[r][c]) ) {
                             return false;
                        }  
                         String key = (r/3) + "," + (c/3);
                         box.putIfAbsent(key, new HashSet<>());
                         if (box.get(key).contains(board[r][c])) {
                            return false;
                        }
                        row.get(r).add(board[r][c]);
                        col.get(c).add(board[r][c]);
                        box.get(key).add(board[r][c]);
                    }
                }
            }
        return true;
    }
}
