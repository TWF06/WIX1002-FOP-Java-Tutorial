import java.util.Scanner;
public class T5Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        //a
        String []code = {"AAA","AAB","AAC","AAD"};
        
        //b #improved whole code
        int sumB=0;
        int[]num =new int[10];
        for (int k=0; k<num.length;k++){
            System.out.print("Enter an integer: ");
            num[k] = sc.nextInt();
        }
        for(int k=0; k<num.length;k++){
            sumB = sumB+num[k];
        }
        System.out.print("Sum is "+sumB);
        
        //c 
        int[][]t = new int[3][3];//second [] must hold greater than 2 to hold t[1][2]
        t[1][2]=5;
        System.out.println(t[1][2]);
        
        //c alternative
        int[][]T = new int[3][];//second [] must hold greater than 2 to hold t[1][2]
        T[1]=new int[3];
        T[1][2]=5;
        System.out.println(T[1][2]);
        
        //d
        int i=4;
        int[]score = new int[5];
        score[1]=78;
        score[--i] =100; //cannot use ++i, will out of storage
        for (int k=0 ; k<score.length; k++)
            System.out.println(score[k]);
        
        
    }
}
