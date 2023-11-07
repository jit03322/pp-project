import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Is_CorrectSudoku Check = new Is_CorrectSudoku();
        Timer timer=new Timer();
        try {
            int[][] matrix = Puzzle_Reader.readFromFile("read.txt");

            int valid = Check.isValid(matrix);

            if (matrix != null && valid == 1) {
                System.out.println("The Sudoku puzzle is valid.");
                
            } else {
                System.out.println("The Sudoku puzzle is invalid.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Write_Solution Sol=new Write_Solution();
        try {
            int[][] matrix = Puzzle_Reader.readFromFile("read.txt");
            int valid=Check.isValid(matrix);
            if (matrix != null) {
                Sudoku sudokuSolver = new Sudoku();
                long startOfTimer=timer.startTime;
                int result = sudokuSolver.sudoku_solve(matrix);
                long endOfTimer=timer.endTime;
                long executedTime=timer.time_of_execution();
                if (result == 1) {
                    System.out.println("the time of execution to solve sudoku is "+executedTime);
                    timer.reset_timer();
                    Sol.writeToFile(matrix, "sol.txt");
                } else {
                    System.out.println("No solution found.");
                }
            }
            else{
                System.out.print("invalid");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

    
