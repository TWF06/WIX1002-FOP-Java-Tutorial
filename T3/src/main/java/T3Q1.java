import java.util.Scanner;
public class T3Q1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //a
        System.out.println("3x8=27 : " + (3*8==27));
        
        //b
        System.out.println("");
        System.out.println("To check a number is an odd number or even number, enter a number : ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Number is even number.");
        else
            System.out.println("Number is odd number.");
        
        //c
        System.out.println("");
        char Charac;
        System.out.println("To check whether a character is capital letter, enter a character : ");
        Charac = sc.next().charAt(0);
        if(Character.isUpperCase(Charac))
            System.out.println(Charac + " is uppercase.");
        else
            System.out.println(Charac + " is lowercase.");
        
        //c ans scheme
        System.out.println("");
        char c ='D';
        if (c>='A' && c<='Z')
            System.out.println(c+" is uppercase");
        else
            System.out.println(c+" is lowercase");
        
        //d
        System.out.println("");
        System.out.println("To check which words come first alphabatically, enter 2 words : ");
        String S1 = sc.next();
        String S2 = sc.next();
        
        if (S1.compareToIgnoreCase(S2) < 0)
            System.out.println(S1 + " comes before " + S2);
        else if (S1.compareToIgnoreCase(S2) > 0)
            System.out.println(S2 + " comes before " + S1);
        else
            System.out.println(S1 + " equal to " + S2);
        
        //e
        System.out.println("");
        System.out.println("Enter day code (0,1,2,3,4,5,6):");
        int Day = sc.nextInt();
        
        outerloop:
        while (true){
        switch(Day){
            case 0:
                System.out.println("Sunday");
                break outerloop;
            case 1:
                System.out.println("Monday");
                break outerloop;
            case 2:
                System.out.println("Tuesday");
                break outerloop;
            case 3:
                System.out.println("Wednesday");
                break outerloop;
            case 4:
                System.out.println("Thursday");
                break outerloop;
            case 5:
                System.out.println("Friday");
                break outerloop;
            case 6:
                System.out.println("Saturday");
                break outerloop;
            default:
                System.out.println("Invalid code");
                System.out.println("Enter day code (0,1,2,3,4,5,6):");
                Day = sc.nextInt();
        }
        }
        
    }
}
