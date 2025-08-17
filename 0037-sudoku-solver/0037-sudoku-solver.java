class Solution {


    
    public boolean isSafe(char[][] board,int r,int c,char d){
        for(int i=0;i<9;i++){
            if(board[i][c]==d) return false;
            if(board[r][i]==d) return false;
        }
        r=r-(r%3);
        c=c-(c%3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[r+i][c+j]==d) return false;
            }
        }
        return true;

    }
    public boolean solve(char[][] board, int row, int col) {
        if(row==9) return true;
        if(col==9) return solve(board,row+1,0);
        if(board[row][col]!='.') return solve(board,row,col+1);
        for(int i=1;i<10;i++){
            if(isSafe(board,row,col,(char)(i+'0'))){
                board[row][col]=(char)(i+'0');
                if(solve(board,row,col+1)) return true;
                board[row][col]='.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}
