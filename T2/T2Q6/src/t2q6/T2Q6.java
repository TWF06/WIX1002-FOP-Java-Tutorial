
package t2q6;
import java.util.Scanner;
public class T2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diameter, circumference;
        System.out.print("Enter diameter: ");
        diameter = sc.nextDouble();
        
        circumference = Math.PI * diameter;
        System.out.printf("The circumference of the circle is: %.3f" , circumference );
        
    }
    
}
