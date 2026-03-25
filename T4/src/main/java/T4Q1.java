import java.util.Scanner;
public class T4Q1 {
    public static void main(String[]args){
        //a
        int a =1, A=0;
        while (A<2000){
        A = (a*a*a);
        System.out.println(a+"\t"+A);
        a++;
        }
        System.out.println("n is "+(a-2));
        
        
        //b
        for (int i=1; i<=12; i++){
            System.out.println(i*i);
        }
        
        
        //c 
        for(int row = 0; row<4; row++){
            for (int col =0;col<5;col++)
                System.out.print(((int)(Math.random()*101))+"\t");
        System.out.print("\n");
        }
        
        //d
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nm = sc.nextInt();
        int sum=0;
        for(int i=1; i<=nm ; i++)
            sum=sum+i;
        System.out.print(sum);
        
        //e
        int j=25;
        double total=0;
        for(int i=1; i<=25; i++){
            total=i/j;
            j--;
        }
        System.out.printf("\nSeries sum: %.2f" ,total);
        
        //e alternative
        double TOTAL = 0;
        for (int i=1; i<=25; i++){
            for(int k=25; k>=1; k--)
                TOTAL = i/k;
        }
        System.out.printf("\nSeries sum: %.2f" ,TOTAL);
        
        //e alternative
        double ans =0;
        for (int i = 1, k=25; i<=25;i++,k--)
            ans=i/k;
        System.out.printf("\nSeries sum: %.2f" ,ans);
        
    }
}
