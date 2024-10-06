import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, World!\n");
            writer.close();
            System.out.println("File written using FileWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
