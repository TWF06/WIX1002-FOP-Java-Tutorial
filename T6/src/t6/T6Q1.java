package t6;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
public class T6Q1 {
    //A
    public static int maximum(int x, int y, int z){
        return Math.max(Math.max(x, y), z);//use nested if else also can
    }
    
    //B
    public static boolean isSquare (int num){
        int temp=(int)Math.sqrt(num);
        if(num>0 && temp*temp ==num)
            return true;
        else
            return false;
    }
    
    //C
    public static long C (int n , int k){
        long temp1=1, temp2=1, temp3=1;
        for(int i=n;i>1;i--){
            temp1 = temp1*i;
        }
        for(int i=k;i>1;i--){
            temp2 = temp2*i;
        }
        for(int i=(n-k); i>1;i--){
            temp3 = temp3*i;
        }
        return (temp1/ (temp2*temp3));
    }
    
    //D
    public static boolean pentNum(int num){
        if (num<=0)
            return false;
        double n= ((1+Math.sqrt(1+24*num))/6);
        if (n%1 ==0)
            return true;
        else
            return false;
    }
    
    //E
    public static char number[] = {'1','2','3','4','5','6','7','8','9','0'};
    public static char alphabet[] ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static int[] noLetterNoDigit(String ABC){
        int [] letterDigit = {0,0};//number, alphabet
        for (int i=0; i<ABC.length(); i ++){
            char temp = ABC.charAt(i);
            for (int j=0; j<number.length;j++){
                if (temp == number[j]){
                    letterDigit[0]++;
                }
            }
            for (int j=0; j<alphabet.length;j++){
                if (Character.toUpperCase(temp) == alphabet[j]){
                    letterDigit[1]++;
                }
            }
        }
        return letterDigit;
    }
    
    //F
    public static void rndmNum (int number[]){
        Random r = new Random();
        for (int i = 0; i<number.length; i++){
            number[i]= r.nextInt(101);
        }
    }
    
    //G
    public static void areaCircum(double save[], int rad){
        save[0] = Math.PI*rad*rad;
        save[1] = 2*Math.PI*rad;
    } 
    
    //H method 1
    public static int findDuplicateA (){
        Random r= new Random();
        int []numSet = new int[1000000000];
        while (true)
        for (int i = 0; i<numSet.length; i++){
            numSet[i]= r.nextInt(11);
            //System.out.println(numSet[i]);
            for (int j = 0; j<i; j++){
                if (numSet[i]==numSet[j])
                    return numSet[j];
            }
        }
    }
    //H method 2
    public static int findDuplicateB (){
        Set<Integer> seen = new HashSet<>();
        Random r = new Random();
        while (true){
            int temp = r.nextInt(11);
            //System.out.println(temp);//test
            if (seen.contains(temp)){
                return temp;
            }    
            seen.add(temp);
        }
    }
    
    public static void main(String[] args) {
        //test run A
        System.out.println("Ques A: " + maximum(1,2,3));
        
        //test run B
        System.out.println("Ques B: " + isSquare(36));
        
        //test run C
        System.out.println("Ques C: " + C(12,11));
        
        //test run D
        System.out.println("Ques D: " + pentNum(21));
        
        //test run E
        int []ansE = noLetterNoDigit("123abcd)");//auto ignore all other character
        System.out.print("Ques E: digit = " + ansE[0]);
        System.out.println(" ,letter = " + ansE[1]);
        
        //test run F
        int[] number=new int[10];
        rndmNum(number);
        System.out.print("Ques F: " );
        for(int a:number){
        System.out.print("\t" + a);
        }
        
        //test run G
        double []save = new double[2];
        areaCircum(save, 10);
        System.out.printf("\nQues G: area %.2f, circumference %.2f%n" ,save[0], save[1]);
        
        //test run H
        System.out.println("Ques H: method A " + findDuplicateA() + " method B "+ findDuplicateB());
        
        
    }   
}
