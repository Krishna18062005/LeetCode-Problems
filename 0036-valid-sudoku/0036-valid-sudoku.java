class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(!isSafe(i,j,board[i][j],board)) return false;
            }
        }
        return true;
    }
    boolean isSafe(int r,int c,char ch,char[][] board){
        if(ch=='.') return true;
        for(int i=0;i<board.length;i++){
            
            if(i!=r&&board[i][c]==ch) return false;
            if(i!=c&&board[r][i]==ch) return false;
           // if(i!=r&&i!=c&&board[i][i]==ch) return false;
        }
        int rr=r-r%3;
        int cc=c-c%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i+rr!=r||j+cc!=c)&&board[i+rr][j+cc]==ch) return false;
            }
        }
        return true;
    }

}