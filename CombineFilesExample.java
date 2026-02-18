import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CombineFilesExample {
    public static void main(String[] args) {

        try {
            // FileInputStreams for two files
            FileInputStream fis1 = new FileInputStream("file1.txt");
            FileInputStream fis2 = new FileInputStream("file2.txt");

            // Output file
            FileOutputStream fos = new FileOutputStream("combine.txt");

            int i;

            // Reading first file and writing to combined file
            while ((i = fis1.read()) != -1) {
                fos.write(i);
            }

            // Add space or newline between contents
            fos.write("\n".getBytes());

            // Reading second file and writing to combined file
            while ((i = fis2.read()) != -1) {
                fos.write(i);
            }

            // Closing all streams
            fis1.close();
            fis2.close();
            fos.close();

            System.out.println("Files combine successfully!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
