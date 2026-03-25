package t7;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1c {
    public static void main(String[]args){
        try(DataOutputStream file = new DataOutputStream(new FileOutputStream("integer.dat"))){
            int i = 1;
            while(i<11){
                int r = (int)(Math.random()*1001);
                System.out.println(r);
                file.writeInt(r);
                i++;
            }
        }catch(IOException e){
            System.out.println("Error.");
        }
    }
}
