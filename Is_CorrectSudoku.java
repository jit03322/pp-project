public class Is_CorrectSudoku {
    public static int isValid(int[][] matrix) {
        for (int i = 0; i < 9; i++) {
            int[] rowChange = new int[10];
            int[] columnChange = new int[10];
            for (int j = 0; j < 9; j++) {
                int rowVal = matrix[i][j];
                int columnVal = matrix[j][i];

                if (rowVal != 0) {
                    if (rowChange[rowVal] == 1) {
                        return 0; // Duplicate in row
                    } else {
                        rowChange[rowVal] = 1;
                    }
                }

                if (columnVal != 0) {
                    if (columnChange[columnVal] == 1) {
                        return 0; 
                    } else {
                        columnChange[columnVal] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] subMatrix = new int[10];

                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        int val = matrix[k][l];
                        if (val != 0) {
                            if (subMatrix[val] == 1) {
                                return 0; 
                            } else {
                                subMatrix[val] = 1;
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }
}
