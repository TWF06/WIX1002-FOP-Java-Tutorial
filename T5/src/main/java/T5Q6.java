
public class T5Q6 {
    public static void main(String[]args){
        int random = (int)(Math.random()*256);
        System.out.println("Random number: "+ random);
        
        int []binary = new int[8];
        int temp = random;
        
        for (int k = (binary.length-1); k>=0; k--){
            binary[k]=temp%2;
            temp=temp/2;
        }
        
        System.out.print("Binary of random num: ");
        for (int k =0;k<binary.length;k++)
            System.out.print(binary[k]);
    }//repeat division with 2 and save answer in array inversely
}
