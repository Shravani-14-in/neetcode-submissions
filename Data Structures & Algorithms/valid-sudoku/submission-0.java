class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> res = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(board[i][j]!='.'){
                    if(!res.add(num+"in row"+ i)||!res.add(num+"in col"+ j)|| !res.add(num+"in box"+ (i/3+"-"+(j/3)))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
