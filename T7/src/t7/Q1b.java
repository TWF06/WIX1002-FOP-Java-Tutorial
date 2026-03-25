package t7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q1b {
    public static void main(String[]args){
        int Large = 0;
        try(BufferedReader file = new BufferedReader(new FileReader("integer.txt"))){
            String i;
            while((i = file.readLine())!= null){
                int j = Integer.parseInt(i);
                System.out.println(j);
                if(j>Large){
                    Large=j;
                }
            }
        }catch(IOException e){
            System.out.println("Error.");
        }
        System.out.println("Largest num is:"+Large);
    }
}
