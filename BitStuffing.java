import java.util.Scanner;

public class BitStuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bit stream: ");
        String data = sc.nextLine();

        String stuffed = "";
        int count = 0;

        // Bit Stuffing
        for (int i = 0; i < data.length(); i++) {
            char bit = data.charAt(i);
            stuffed += bit;

            if (bit == '1') {
                count++;
            } else {
                count = 0;
            }

            if (count == 5) {
                stuffed += '0';  // Stuff a 0
                count = 0;
            }
        }

        System.out.println("\nStuffed Bit Stream: " + stuffed);

        // Bit De-stuffing
        String destuffed = "";
        count = 0;

        for (int i = 0; i < stuffed.length(); i++) {
            char bit = stuffed.charAt(i);
            destuffed += bit;

            if (bit == '1') {
                count++;
            } else {
                count = 0;
            }

            if (count == 5) {
                i++;   // Skip the stuffed 0
                count = 0;
            }
        }

        System.out.println("De-stuffed Bit Stream: " + destuffed);

        // Verification
        if (data.equals(destuffed)) {
            System.out.println("\nVerification: SUCCESS ✅ Original data recovered");
        } else {
            System.out.println("\nVerification: FAILED ❌ Data mismatch");
        }

        sc.close();
    }
}
