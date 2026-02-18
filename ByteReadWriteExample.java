import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReadWriteExample {
    public static void main(String[] args) {
        try {
            // Reading data from file first
            FileInputStream fis = new FileInputStream("bytefile.txt");
            int i;
            System.out.print("Data read from file: ");
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();

            System.out.println(); // for new line

            // Writing data to file after reading
            FileOutputStream fos = new FileOutputStream("bytefile.txt");
            String data = "Hello Aryan!";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
