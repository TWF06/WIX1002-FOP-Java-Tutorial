import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sentence = sc.nextLine();
        String fileName = "data.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            StringBuilder binaryResult = new StringBuilder();
            
            for (char c : sentence.toCharArray()) {
                // Convert char to 8-bit binary string
                String binary = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
                binaryResult.append(binary).append(" "); // Space added for readability
            }
            
            writer.print(binaryResult.toString());
            System.out.println("Binary data saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Read from File and Convert back to Sentence
        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.print("Decoded Sentence: ");
            
            while (scanner.hasNext()) {
                String binaryPart = scanner.next();
                // Convert binary string back to decimal integer, then to char
                int charCode = Integer.parseInt(binaryPart, 2);
                System.out.print((char) charCode);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
