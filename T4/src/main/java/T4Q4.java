import java.util.Scanner;
public class T4Q4 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a String");
        String str=sc.nextLine();
        
        int lgth= str.length();
        System.out.println("Length of string is:"+lgth);
        
        for(int l=lgth; l>0; l--){
            System.out.print(str.charAt(l-1));
        }
            
    }
}
