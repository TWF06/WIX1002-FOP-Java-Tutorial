package t7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q1a {
    public static void main(String[]args){
        try(BufferedWriter file = new BufferedWriter(new FileWriter("integer.txt"))){
            int i = 1;
            while(i<1001){
                file.write(String.valueOf(i));
                file.newLine();
                i++;
            }
        }catch(IOException e){
            System.out.println("Error.");
        }
    }
}
