class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i = 0; i<rows; i++){
            if(i % 2 == 0){
                for(int j = 0;j<cols; j++){
                    if(count % 2 == 0){
                        ans.add(grid[i][j]);
                    }
                    count++;
                }
            }else{
                for(int j = cols-1; j >= 0; j--){
                    if(count % 2 == 0){
                        ans.add(grid[i][j]);
                    }
                    count++;
                }
            }
        }
        return ans;
    }
}
