class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashMap's for rows, columns, sub-grid
        HashMap<Integer, HashSet<Character>> mppRows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> mppCols = new HashMap<>();
        HashMap<String, HashSet<Character>> mppGrid = new HashMap<>();

        // In one pass over entire suduko box.
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                String gridKey = (i/3) + "," + (j/3);
                if(board[i][j]=='.') continue;
                if(mppRows.computeIfAbsent(i,k-> new HashSet<>()).contains(board[i][j]) || 
                mppCols.computeIfAbsent(j,k-> new HashSet<>()).contains(board[i][j]) || 
                mppGrid.computeIfAbsent(gridKey,k-> new HashSet<>()).contains(board[i][j])) {
                    return false;
                }
                mppRows.get(i).add(board[i][j]);
                mppCols.get(j).add(board[i][j]);
                mppGrid.get(gridKey).add(board[i][j]);
            }
        }
        return true;
        
    }
}