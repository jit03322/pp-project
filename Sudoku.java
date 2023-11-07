public class Sudoku {
    //this sudoku_solve method is for solving sudoku
    public int sudoku_solve(int [][]matrix){
        int row,column;
        int [] cell=empty_cell(matrix);
        row = cell[0];
        column=cell[1];
        if(row==-1&&column==-1){
            return 1;
        }
        for(int value=1;value<=9;value++){
            if(isValid(matrix, row, column, value)==1){
                matrix[row][column]=value;

                if(sudoku_solve(matrix)==1){
                    return 1;
                }
                matrix[row][column]=0;
            }
        }
        return 0;

    }
    //empty_cell finds the empty cell
    private int [] empty_cell(int [][]matrix){
        int[] result={-1,-1};
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(matrix[i][j]==0){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;

    } 
    //the value is valid or not according to sudoku rules
    public int isValid(int [][]matrix,int row,int column,int value){
        
        for(int i=0;i<9;i++){
            if(matrix[row][i]==value){
                return 0;//return 0 means the cell would be empty
            }
        }
        for(int j=0;j<9;j++){
            if(matrix[j][column]==value){
                return 0;
            }
        }
        //check for sub matrix 
        // to go first cell of sub matrices so we can find with the help of sr and sc
        int sr=(row/3)*3;
        int sc=(column/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(matrix[i][j]==value){
                    return 0;
                }
            }
        }
        return 1; //return 1 means the cell would be occupied with true value
    }
}
