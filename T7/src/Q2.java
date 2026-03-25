
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Q2 {
    public static void main(String []args) {
        
        //a : \change to\\ and must be in try catch block or throw exception
//        try{
//            PrintWriter out = new PrintWriter(new FileOutputStream("E:\\UM\\Y1S1\\Y1S1 FOP\\T7\\matrix.txt"));
//        }catch(FileNotFoundException e){
//            System.out.println("Error FNFException");
//        }
        
        //b : error message
//        try {
//            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
//            out.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Problem with finding file");
//        }

        //c : must be in try catch block or throw exception, wrong file name
//        int num;
//        try{
//            Scanner a = new Scanner(new FileInputStream("data.txt"));
//            while(a.hasNext()){//improved with loop 
//                num = a.nextInt();
//                System.out.print(num +" ");
//            }
//            a.close();
//        }catch(IOException e){
//            System.out.println("Error");
//        }
        
        //d : try catch block, print to write
        try{
            ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
            o.write('A');
            o.close();
        }catch(IOException e){
            System.err.print(e);
        }
        

        
    }
}
