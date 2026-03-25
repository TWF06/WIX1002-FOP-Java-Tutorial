package t7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Q1d {
    public static void main(String[]args){
        int sum=0, avg;
        try (DataInputStream dis = new DataInputStream(new FileInputStream("integer.dat"))) {
            for (int i = 0; i < 10; i++) {
                int number = dis.readInt();
                System.out.println(number);
                sum +=number;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        avg=sum/10;
        System.out.print("Average"+avg);
    }
}
