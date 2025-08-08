class Solution {
    public boolean isValidSudoku(char[][] nums) {
        HashMap<Integer, HashSet<Character>> rowmpp = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colmpp = new HashMap<>();
        HashMap<String, HashSet<Character>> square = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (nums[i][j] == '.')
                    continue;
                String sqareKey = (i / 3) + "," + (j / 3);
                if (rowmpp.computeIfAbsent(i, k -> new HashSet<>()).contains(nums[i][j]) ||
                        colmpp.computeIfAbsent(j, k -> new HashSet<>()).contains(nums[i][j]) ||
                        square.computeIfAbsent(sqareKey, k -> new HashSet<>()).contains(nums[i][j])) {
                    return false;
                }
                rowmpp.get(i).add(nums[i][j]);
                colmpp.get(j).add(nums[i][j]);
                square.get(sqareKey).add(nums[i][j]);

            }
        }
        return true;
    }
}