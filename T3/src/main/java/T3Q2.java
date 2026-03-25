
public class T3Q2 {
    public static void main(String[]args){
        //a
        int num1 = 1;
        int num2 = 1;
        if(num1 == num2)
            System.out.println("Number 1 is equal to number 2.");
        
        //b
        int x = 3, y = 2, z = 1;
        if(x > y && x > z)
            System.out.println("x is the largest number");
        
        //c
        String s1="", s2="";
        if (s1.equals(s2))
            System.out.println("They are equal strings.");
        else
            System.out.println("They are not equal strings");
        
        //d
        //use same declaration from b question
        if(x>0 || y>0)
            System.out.println("Either x or y is positive");
    }
}
