import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Puzzle_Reader {
     public static int[][] readFromFile(String file_name) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file_name));
        int[][] matrix = new int[9][9];
        String line;
        int row = 0;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            for (int column = 0; column < parts.length; column++) {
                matrix[row][column] = Integer.parseInt(parts[column]);
            }
            row++;
        }
        reader.close();
        return matrix;
    }
}
