/* 
Input:
grid[][] = 
[[3 6 6 5 0 8 4 0 0],
[5 2 0 0 0 0 0 0 0],
[0 8 7 0 0 0 0 3 1 ],
[0 0 3 0 1 0 0 8 0],
[9 0 0 8 6 3 0 0 5],
[0 5 0 0 9 0 6 0 0],
[1 3 0 0 0 0 2 5 0],
[0 0 0 0 0 0 0 7 4],
[0 0 5 2 0 6 3 0 0]]
Output:
False
*/
class Solution
{   
    public static boolean isSafe(int row, int col, int num, int [][] grid){
        int N = grid.length;
        for(int i=0; i<N; i++){
            if(grid[row][i] == num) return false;
            if(grid[i][col] == num) return false;
        }
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i= sr; i< sr+3; i++){
            for(int j=sc; j< sc+3; j++){
                if(grid[i][j] == num) return false;
            }
        }
        return true;
    }
     public static boolean solve(int row, int col, int [][] grid){
        int N = grid.length;
        if(row == N) return true;
        int NRow=0, NCol=0;
        if(col != N-1) {
            NRow = row;
            NCol = col + 1;
        }else {
            NRow = row + 1;
            NCol = 0;
        }
        if(grid[row][col] == 0){
            for(int num=1; num<=9; num++){
                if(isSafe(row, col, num, grid)){
                    grid[row][col] = num;
                    if(solve(NRow, NCol, grid)) return true;
                    grid[row][col] = 0;
                }
            }
        }else {
            if(solve(NRow, NCol, grid)) return true;
        }
        return false;
    }
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        int n = grid.length, m = grid[0].length;
        return solve(0, 0, grid);
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        int n = grid.length, m= grid[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) System.out.print(grid[i][j]+" ");
        }
    }
}
