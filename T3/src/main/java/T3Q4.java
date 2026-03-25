
public class T3Q4 {
    public static void main(String[]args){
    int x = 3, y = 2, z = 8;
    if(x > y && x > z)
        System.out.println("x is the largest number");
    else if (y > x && y > z)
        System.out.println("y is the largest number");
    else if (z > x && z > y)
        System.out.println("z is the largest number");
    else
        System.out.println("There are equal numbers.");
    }
}
