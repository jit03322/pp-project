import java.io.FileWriter;
import java.io.IOException;
public class Write_Solution {
    public void writeToFile(int[][] matrix, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("out of the given puzzle is \n");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    writer.write(matrix[i][j] + ",");
                }
                writer.write("\n");
            }
            System.out.print("code successful");
            writer.close();
        } catch (IOException e) {
            // Handle the IOException
            e.printStackTrace(); // You can change this to a more appropriate error handling strategy
        }
    }
}
