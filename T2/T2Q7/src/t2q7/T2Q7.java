package t2q7;
import java.util.Scanner;
public class T2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch, meter;
        
        System.out.print("Enter value in inch: ");
        inch = sc.nextDouble();
        
        meter = inch * 0.0254;
        System.out.print(inch);
        System.out.printf(" inches = %.2f",meter);
        System.out.print(" meters");
    }
    
}
