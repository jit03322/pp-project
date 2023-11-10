import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class PuzzleEraser {
    //by this method if we enter invalid puzzle then the solution would be empty
    public static void erasePuzzle(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(""); // Overwrite the file content with an empty string
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
